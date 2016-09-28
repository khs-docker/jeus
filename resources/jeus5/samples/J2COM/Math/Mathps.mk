
Mathps.dll: dlldata.obj Math_p.obj Math_i.obj
	link /dll /out:Mathps.dll /def:Mathps.def /entry:DllMain dlldata.obj Math_p.obj Math_i.obj \
		kernel32.lib rpcndr.lib rpcns4.lib rpcrt4.lib oleaut32.lib uuid.lib \

.c.obj:
	cl /c /Ox /DWIN32 /D_WIN32_WINNT=0x0400 /DREGISTER_PROXY_DLL \
		$<

clean:
	@del Mathps.dll
	@del Mathps.lib
	@del Mathps.exp
	@del dlldata.obj
	@del Math_p.obj
	@del Math_i.obj
