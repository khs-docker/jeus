
#include "stdafx.h"
#include <comdef.h>
#include <iostream>

#import "C:\j2ee-cas-com-bridge\bin\jvm-control.dll"
#import "C:\jeus50\samples\CAS\jeus-services.dll"
#import "C:\j2ee-cas-com-bridge\doc\guide\examples\typelib\comaccount_AccountHome.tlb"
#import "C:\j2ee-cas-com-bridge\doc\guide\examples\typelib\comaccount_Account.tlb"
#import "C:\j2ee-cas-com-bridge\doc\guide\examples\typelib\java_util_Collection.tlb"
#import "C:\j2ee-cas-com-bridge\doc\guide\examples\typelib\java_util_Iterator.tlb"

using namespace std;
using namespace ComBridgeJvmControl;
using namespace ComBridgeJeusServices;
using namespace comaccount_AccountHome_Lib;
using namespace comaccount_Account_Lib;
using namespace java_util_Collection_Lib;
using namespace java_util_Iterator_Lib;

#define COMBRIDGE_SMARTPTR_TYPEDEF(Interface) \
    typedef _com_ptr_t<_com_IIID<Interface, &__uuidof(Interface)> > Interface ## _ptr;

COMBRIDGE_SMARTPTR_TYPEDEF(java_util_Collection)
COMBRIDGE_SMARTPTR_TYPEDEF(java_util_Iterator)
COMBRIDGE_SMARTPTR_TYPEDEF(comaccount_AccountHome)
COMBRIDGE_SMARTPTR_TYPEDEF(comaccount_Account)


IJeusServicesPtr jeus;
comaccount_AccountHome_ptr acctHome;


void Initialize(void)
{
    // Initialize the JVM
    IJvmControlPtr jvmCtl(__uuidof(JvmControl));
	    
	jvmCtl->put_Classpath(L"C:\\jeus50\\lib\\system\\jeus.jar;C:\\jeus50\\lib\\system\\jmxri.jar;C:\\jeus50\\lib\\system\\jmxremote.jar;C:\\jeus50\\lib\\system\\jmxtools.jar;C:\\jeus50\\samples\\CAS\\examples\\classes\\deployexample\\build");
	
	//When system classpath is set
	//jvmCtl->put_Classpath(L"%JEUS_HOME%\\lib\\system\\jeus.jar;%JEUS_HOME%\\lib\\system\\jmxri.jar;%JEUS_HOME%\\lib\\system\\jmxremote.jar;%JEUS_HOME%\\lib\\system\\jmxtools.jar;%JEUS_HOME%\\samples\\CAS\\examples\\classes\\deployexample\\build");
	
	jvmCtl->put_JvmOptions(L"-Djeus.baseport=2100");
    jvmCtl->StartJvm();

    // Create an enterprise services object for EJB access
	jeus.CreateInstance(__uuidof(JeusServices));
    jeus->put_ProviderURL(L"localhost");

    //Retrieve reference to EJB home interface using enterprise services    
	acctHome = jeus->LookupEjbHome(L"MyComAccount", L"comaccount.AccountHome");		
}


void Cleanup(void)
{
    jeus = NULL;
    acctHome = NULL;
}

void PrintAccount(comaccount_Account_ptr acct)
{
    cout << "Account ID: " << (char *)acct->getAccountId() << endl;
    cout << "Account Type: " << (char *)acct->getType() << endl;
    cout << "First Name: " << (char *)acct->getFirstName() << endl;
    cout << "Last Name: " << (char *)acct->getLastName() << endl;
    cout << "Balance: " << acct->getBalance() << endl;
    cout << "Credit Limit: " << acct->getCreditLimit() << endl;
}


void DisplayAccountInfo(_bstr_t & acctId)
{
    
	comaccount_Account_ptr acct;

    if (!acctId)
    {
        // If no account id is specified, print them all
    
        // Retrieve a collection that contains info for all accounts
        java_util_Collection_ptr coll = acctHome->findAll();
        
        // Create an iterator on the collection
        java_util_Iterator_ptr iter = coll->iterator();

        if (iter->hasNext())
        {
            // If there is at least one account, iterate over the
            // collection and print each account's info
            while (iter->hasNext())
            {
                acct = iter->next();
                PrintAccount(acct);
                cout << endl << endl;
            }
        }
        else
        {
            // If there are not accounts, notify the user
            cout << endl << "No accounts were found." << endl << endl;
        }
    }
    else
    {
        // If an account id is specified, print on the info for that account
        
        // Retrieve the info for the specified account, making sure to
        // catch exceptions because findByPrimaryKey returns the
        // ObjectNotFound exception if the account doesn't exist
        try
        {
            acct = acctHome->findByPrimaryKey(acctId);

            // If the account does exist, print its info
            PrintAccount(acct);
            cout << endl << endl;
        }
        catch ( ... )
        {
            // If the account doesn't exist, notify the user
            cout << endl << "Account " << (char *)acctId << " was not found." << endl << endl;
        }
    }
}


int main(int argc, char* argv[])
{
    CoInitialize(NULL);

    Initialize();

    _bstr_t acctId = ((argc > 1) ? argv[1] : NULL);

    DisplayAccountInfo(acctId);

    Cleanup();

    CoUninitialize();

	return 0;
}
