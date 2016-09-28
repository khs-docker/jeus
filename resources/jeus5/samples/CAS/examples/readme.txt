1. 상위 디렉토리에 있는 j2eecas-1_0-ea4-win-combridge.exe 를 설치한다.
2. ./setting 에 가서 createcomAccountTypeLibs.bat를 실행 시켜서 tlb 파일이 j2ee-cas-com-bridge\doc\guide\examples\typelib
   에 생성되도록 한다.
3. classes의 deployexample에서 "jant"를 수행하면 comaccount EJB 모듈이 빌드되고 디플로이된다.
4. 정상적으로 디플로이가 수행되었다면, "jant run"을 이용하여 AccountClient를 수행하면 된다.
5. Client가 정상적으로 수행된다면 vb나 vc 등의 예제를 수정하여 빌드 후 실행하면된다.