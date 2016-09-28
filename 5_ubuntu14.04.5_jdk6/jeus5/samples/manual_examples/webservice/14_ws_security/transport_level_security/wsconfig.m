*DOMAIN
jeuservice		

*NODE
flash		
			Port = "8089",	
			Logging = "log1",	
			Docroot = "C:/Product/JEUS/5b42/docs",	
			ErrorLog = "log2",	
			Shmkey = 54333,	
			Hth = 1,	
			WebtobDir = "C:/Product/JEUS/5b42/webserver",	
			JsvPort = 9901	

*LOGGING
log1		
			FileName = "C:/Product/JEUS/5b42/log/access.log",	
			Format = "DEFAULT",	
			Option = "sync"	
log2		
			FileName = "C:/Product/JEUS/5b42/log/error.log",	
			Format = "ERROR",	
			Option = "sync"	
log3		
			FileName = "C:/Product/JEUS/5b42/log/sslerror.log",	
			Format = "ERROR",	
			Option = "sync"	

*SSL
ssl1		
			CertificateFile = "C:/Product/JEUS/5b42/webserver/ssl/newcert.pem",	
			CertificateKeyFile = "C:/Product/JEUS/5b42/webserver/ssl/newcert.pem"	

*URI
uri1		
			uri = "/cgi-bin/",	
			SvrType = "CGI"	
uri2		
			uri = "/examples/",	
			SvrType = "JSV"	

uri3		
			uri = "/PingSSLSecurity/",	
			SvrType = "JSV"	

*SERVER
html		
			SvgName = "htmlg",	
			MinProc = 1,	
			MaxProc = 2	
cgi		
			SvgName = "cgig",	
			MinProc = 1,	
			MaxProc = 2	
ssi		
			SvgName = "ssig",	
			MinProc = 1,	
			MaxProc = 2	
MyGroup		
			SvgName = "jsvg",	
			MinProc = 1,	
			MaxProc = 5	

*EXT
htm		
			SvrType = "HTML",	
			Mimetype = "text/html"	

*VHOST
jeusssl		
			Port = "8443",	
			NodeName = "flash",	
			SslFlag = Y ,	
			SslName = "ssl1",	
			Docroot = "C:/Product/JEUS/5b42/docs",	
			Hostname = "localhost",	
			ErrorLog = "log3"	

*SVRGROUP
htmlg		
			NodeName = "flash",	
			SvrType = "HTML"	
cgig		
			NodeName = "flash",	
			SvrType = "CGI"	
ssig		
			NodeName = "flash",	
			SvrType = "SSI"	
jsvg		
			NodeName = "flash",	
			SvrType = "JSV"	
