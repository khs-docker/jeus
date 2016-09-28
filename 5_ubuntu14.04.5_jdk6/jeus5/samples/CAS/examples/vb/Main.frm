VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "COM Bridge - Example 6"
   ClientHeight    =   3945
   ClientLeft      =   60
   ClientTop       =   345
   ClientWidth     =   4230
   LinkTopic       =   "Form1"
   ScaleHeight     =   3945
   ScaleWidth      =   4230
   StartUpPosition =   3  'Windows Default
   Begin VB.CommandButton FindCmd 
      Caption         =   "Find"
      Height          =   375
      Left            =   3000
      TabIndex        =   3
      Top             =   3480
      Width           =   1095
   End
   Begin VB.TextBox AcctId 
      Height          =   375
      Left            =   1200
      TabIndex        =   2
      Text            =   "Text1"
      Top             =   3480
      Width           =   1455
   End
   Begin VB.TextBox AcctInfo 
      Height          =   3135
      Left            =   120
      MultiLine       =   -1  'True
      ScrollBars      =   2  'Vertical
      TabIndex        =   0
      Text            =   "Main.frx":0000
      Top             =   120
      Width           =   3975
   End
   Begin VB.Label Label1 
      Caption         =   "Account ID:"
      Height          =   255
      Left            =   240
      TabIndex        =   1
      Top             =   3600
      Width           =   855
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Jeus As JeusServices
Private AcctHome As comaccount_AccountHome


Private Sub Form_Load()
     'Initialize the JVM
     Dim JvmCtl As New JvmControl
     'when system classpath is not set
     JvmCtl.Classpath = "C:\jeus50\lib\system\jeus.jar;C:\jeus50\lib\system\jmxtools.jar;C:\jeus50\lib\system\jmxri.jar;C:\jeus50\lib\system\jmxremote.jar;C:\jeus50\samples\CAS\examples\classes\deployexample\build"
     'JvmCtl.Classpath = "%JEUS_HOME%\lib\system\jeus.jar;%JEUS_HOME%\lib\system\jmxtools.jar;%JEUS_HOME%\lib\system\jmxri.jar;%JEUS_HOME%\lib\system\jmxremote.jar;%JEUS_HOME%\samples\CAS\examples\classes\deployexample\build"

     
     JvmCtl.JvmOptions = "-Djeus.baseport=2100"
     
            
     
     
     JvmCtl.StartJvm
    
    'Create an enterprise services object for EJB access
    Set Jeus = New JeusServices
    Jeus.ProviderURL = "localhost"
        
    'Retrieve reference to EJB home interface using enterprise services
    Set AcctHome = Jeus.LookupEjbHome("MyComAccount", "comaccount.AccountHome")
    
    'Initialize user interface components
    AcctInfo.Text = ""
    AcctId.Text = ""
End Sub

Private Sub FindCmd_Click()
    Dim DisplayStr As String
    DisplayStr = ""
        
    Dim Acct As comaccount_Account
    
    If AcctId.Text = "" Then
        'If no account id is specified, print them all
    
        'Retrieve a collection that contains info for all accounts
        Dim Coll As java_util_Collection
        Set Coll = AcctHome.findAll
        
        'Create an iterator on the collection
        Dim Iter As java_util_Iterator
        Set Iter = Coll.iterator
        
        If Iter.hasNext Then
            'If there is at least one account, iterate over the
            'collection and print each account's info
            While Iter.hasNext
                Set Acct = Iter.Next
                DisplayStr = DisplayStr & PrintAccount(Acct) & vbCrLf & vbCrLf
            Wend
        Else
            'If there are not accounts, notify the user
            DisplayStr = "No accounts were found."
        End If
    Else
        'If an account id is specified, print on the info for that account
        
        'Retrieve the info for the specified account, making sure to
        'catch exceptions because findByPrimaryKey returns the
        'ObjectNotFound exception if the account doesn't exist
        On Error Resume Next
        Set Acct = AcctHome.findByPrimaryKey(AcctId.Text)
        On Error GoTo 0
        
        Dim FoundAcct As Boolean
        FoundAcct = False
        If VarType(Acct) = vbObject Then
            If Not Acct Is Nothing Then
                FoundAcct = True
            End If
        End If
        
        If FoundAcct Then
            'If the account does exist, print its info
            DisplayStr = DisplayStr & PrintAccount(Acct)
        Else
            'If the account doesn't exist, notify the user
            DisplayStr = "Account " & AcctId.Text & " was not found."
        End If
    End If
    
    AcctInfo.Text = DisplayStr
End Sub


Private Function PrintAccount(ByVal Acct As comaccount_Account) As String
    Dim AcctStr As String
    AcctStr = ""
    
    AcctStr = AcctStr & "Account ID: " & Acct.AccountId & vbCrLf
    AcctStr = AcctStr & "Account Type: " & Acct.Type & vbCrLf
    AcctStr = AcctStr & "First Name: " & Acct.FirstName & vbCrLf
    AcctStr = AcctStr & "Last Name: " & Acct.LastName & vbCrLf
    AcctStr = AcctStr & "Balance: " & Acct.Balance & vbCrLf
    AcctStr = AcctStr & "Credit Limit: " & Acct.CreditLimit & vbCrLf
    
    PrintAccount = AcctStr
End Function



