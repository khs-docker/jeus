package ejb.relation.mtom;

import java.rmi.RemoteException;

import javax.ejb.EJBObject;


public interface mtmtest extends EJBObject
{
   public void testSetCourseIntoStudent() throws RemoteException;

   public void testSetStudentIntoCourse() throws RemoteException;

   public void testPrintStudentsCourse() throws RemoteException;

   public void testPrintCoursesStudent() throws RemoteException;

   public void testDeleteCourseFromStudent() throws RemoteException;

   public void testDeleteStudentFromCourse() throws RemoteException;
}
