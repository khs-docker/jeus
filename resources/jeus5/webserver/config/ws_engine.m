*DOMAIN
jeuservice

*NODE
ce56086ff287    
  WEBTOBDIR = "/root/jeus5/webserver", 
  SHMKEY    = 54000,
  DOCROOT   = "/root/jeus5/webserver/docs",
  PORT      = "8080", 
  LOGGING   = "log1",
  ERRORLOG  = "log2",
  JSVPORT   = 9900,
  HTH       = 1

*SVRGROUP
htmlg       NODENAME = "ce56086ff287", SVRTYPE = HTML
cgig        NODENAME = "ce56086ff287", SVRTYPE = CGI
ssig        NODENAME = "ce56086ff287", SVRTYPE = SSI
jsvg        NODENAME = "ce56086ff287", SVRTYPE = JSV

*SERVER
html        SVGNAME  = htmlg, MinProc = 1,  MaxProc = 2
cgi         SVGNAME  = cgig,  MinProc = 1,  MaxProc = 2
ssi         SVGNAME  = ssig,  MinProc = 1,  MaxProc = 2
MyGroup     SVGNAME  = jsvg,  MinProc = 1, MaxProc = 5

*URI
uri1        Uri      = "/cgi-bin/",  Svrtype = CGI
uri2        Uri      = "/examples/", Svrtype = JSV

*ALIAS
alias1      URI      = "/cgi-bin/", RealPath = "/root/jeus5/webserver/cgi-bin/"

*LOGGING
log1        Format   = "DEFAULT",   FileName = "/root/jeus5/webserver/log/access.log", Option = "sync"
log2        Format   = "ERROR",     FileName = "/root/jeus5/webserver/log/error.log",  Option = "sync"

*EXT
htm         MimeType = "text/html",  SvrType = HTML
jsp   		Mimetype ="application/jsp",  Svrtype=JSV,  SvrName=MyGroup
