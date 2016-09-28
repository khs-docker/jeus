
Emailps.dll: dlldata.obj Email_p.obj Email_i.obj
	link /dll /out:Emailps.dll /def:Emailps.def /entry:DllMain dlldata.obj Email_p.obj Email_i.obj \
		kernel32.lib rpcndr.lib rpcns4.lib rpcrt4.lib oleaut32.lib uuid.lib \

.c.obj:
	cl /c /Ox /DWIN32 /D_WIN32_WINNT=0x0400 /DREGISTER_PROXY_DLL \
		$<

clean:
	@del Emailps.dll
	@del Emailps.lib
	@del Emailps.exp
	@del dlldata.obj
	@del Email_p.obj
	@del Email_i.obj
