package filters;

import java.io.*;

public final class Counter {
    private static final String COUNT_FILE = "count.dat";

    private File countFile;
    private int count;

    public Counter() {
        String jeushome = System.getProperty("jeus.home");
        String countFilePath = jeushome + File.separator + "logs" +
            File.separator + COUNT_FILE;
        System.out.println("[DDD] Counter init : " + countFilePath);
        try {
            countFile = new File(countFilePath);
            if (!countFile.exists()) {
                countFile.createNewFile();
                count = 0;
            } else {
                DataInputStream in = new DataInputStream(new FileInputStream(countFile));
                count = in.readInt();
                in.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
            count = 0;
        }
    }

    public synchronized int incCounter() {
        return ++count;
    }

    public void destroy() {
        System.out.println("[DDD] Counter destroy");
        try {
            DataOutputStream out = new DataOutputStream(new
                FileOutputStream(countFile));
            out.writeInt(count);
            out.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
