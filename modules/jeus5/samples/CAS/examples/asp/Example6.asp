<%@ LANGUAGE = VBScript %>
<%   Option Explicit %>


<HTML>
	<HEAD>
		<TITLE>COM Bridge - Example 6</TITLE>
	</HEAD>

	<BODY>
		<H1>COM Bridge - Example 6</H1>

		<FORM METHOD="Post" ACTION="Example6.asp">
			Account ID: <INPUT TYPE="Text" NAME="AcctId"> 
			<INPUT TYPE="Hidden" NAME="ShowAcctInfo" VALUE="True">
			<INPUT TYPE="Submit" VALUE="Find">
		</FORM>

		<PRE>

<%
	Dim ShowAcctInfo
	ShowAcctInfo = CBool(Request.Form("ShowAcctInfo"))

	If ShowAcctInfo Then
		Dim DisplayStr
		DisplayStr = ""

		Dim Acct

		Dim AcctHome
		Set AcctHome = Application("AcctHome")
    
		Dim AcctId
		AcctId = CStr(Request.Form("AcctId"))
    
		If AcctId = "" Then
			'If no account id is specified, print them all
    
			'Retrieve a collection that contains info for all accounts
			Dim Coll
			Set Coll = AcctHome.findAll
        
			'Create an iterator on the collection
			Dim Iter
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
			Set Acct = AcctHome.findByPrimaryKey(AcctId)
			On Error GoTo 0
        
			Dim FoundAcct
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
				DisplayStr = "Account " & AcctId & " was not found."
			End If
		End If
    
		Response.Write DisplayStr
	End If


	Function PrintAccount(ByVal Acct)
		Dim AcctStr
		AcctStr = ""
    
		AcctStr = AcctStr & "Account ID: " & Acct.AccountId & vbCrLf
		AcctStr = AcctStr & "Account Type: " & Acct.Type & vbCrLf
		AcctStr = AcctStr & "First Name: " & Acct.FirstName & vbCrLf
		AcctStr = AcctStr & "Last Name: " & Acct.LastName & vbCrLf
		AcctStr = AcctStr & "Balance: " & Acct.Balance & vbCrLf
		AcctStr = AcctStr & "Credit Limit: " & Acct.CreditLimit & vbCrLf
    
		PrintAccount = AcctStr
	End Function
%>

		</PRE>
	</BODY>
</HTML>

