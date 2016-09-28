// ************************************************************************ //
// The types declared in this file were generated from data read from the
// WSDL File described below:
// WSDL     : http://192.168.1.48:32102/DataEchoService/DataEchoService?wsdl
// Encoding : UTF-8
// Version  : 1.0
// (2004-12-23 ¿ÀÈÄ 8:14:01 - 1.33.2.5)
// ************************************************************************ //

unit DataEchoService;

interface

uses InvokeRegistry, SOAPHTTPClient, Types, XSBuiltIns;

type

  // ************************************************************************ //
  // The following types, referred to in the WSDL document are not being represented
  // in this file. They are either aliases[@] of other types represented or were referred
  // to but never[!] declared in the document. The types from the latter category
  // typically map to predefined/known XML or Borland types; however, they could also 
  // indicate incorrect WSDL documents that failed to declare or import a schema type.
  // ************************************************************************ //
  // !:string          - "http://www.w3.org/2001/XMLSchema"
  // !:boolean         - "http://www.w3.org/2001/XMLSchema"
  // !:double          - "http://www.w3.org/2001/XMLSchema"
  // !:float           - "http://www.w3.org/2001/XMLSchema"
  // !:int             - "http://www.w3.org/2001/XMLSchema"
  // !:byte            - "http://www.w3.org/2001/XMLSchema"
  // !:decimal         - "http://www.w3.org/2001/XMLSchema"
  // !:dateTime        - "http://www.w3.org/2001/XMLSchema"



  // ************************************************************************ //
  // Namespace : urn:DataEchoService
  // soapAction: hokeAction
  // transport : http://schemas.xmlsoap.org/soap/http
  // style     : document
  // binding   : DataEchoSoapBinding
  // service   : DataEchoService
  // port      : DataEchoPort
  // URL       : http://192.168.1.48:32102/DataEchoService/DataEchoService
  // ************************************************************************ //
  DataEcho = interface(IInvokable)
  ['{ECD93E72-3F2B-9CB4-921A-F7853B68CC6E}']
    function  echoString(const in0: WideString): WideString; stdcall;
    function  echoBoolean(const in0: Boolean): Boolean; stdcall;
    function  echoDouble(const in0: Double): Double; stdcall;
    function  echoFloat(const in0: Single): Single; stdcall;
    function  echoInteger(const in0: Integer): Integer; stdcall;
    function  echoByte(const in0: Shortint): Shortint; stdcall;
    function  echoBigDecimal(const in0: TXSDecimal): TXSDecimal; stdcall;
    function  echoCalendar(const in0: TXSDateTime): TXSDateTime; stdcall;
  end;

function GetDataEcho(UseWSDL: Boolean=System.False; Addr: string=''; HTTPRIO: THTTPRIO = nil): DataEcho;


implementation

function GetDataEcho(UseWSDL: Boolean; Addr: string; HTTPRIO: THTTPRIO): DataEcho;
const
{
  defWSDL = 'http://192.168.1.223:8899/DataEchoService/DataEchoService?wsdl';
  defURL  = 'http://192.168.1.223:8899/DataEchoService/DataEchoService';
  defSvc  = 'DataEchoService';
  defPrt  = 'DataEchoPort';
 }
  defWSDL = 'http://192.168.1.48:32102/DataEchoService/DataEchoService?wsdl';
  defURL  = 'http://192.168.1.48:32102/DataEchoService/DataEchoService';
  defSvc  = 'DataEchoService';
  defPrt  = 'DataEchoPort';

var
  RIO: THTTPRIO;
begin
  Result := nil;
  if (Addr = '') then
  begin
    if UseWSDL then
      Addr := defWSDL
    else
      Addr := defURL;
  end;
  if HTTPRIO = nil then
    RIO := THTTPRIO.Create(nil)
  else
    RIO := HTTPRIO;
  try
    Result := (RIO as DataEcho);
    if UseWSDL then
    begin
      RIO.WSDLLocation := Addr;
      RIO.Service := defSvc;
      RIO.Port := defPrt;
    end else
      RIO.URL := Addr;
  finally
    if (Result = nil) and (HTTPRIO = nil) then
      RIO.Free;
  end;
end;


initialization
  InvRegistry.RegisterInterface(TypeInfo(DataEcho), 'urn:DataEchoService', 'UTF-8');
  InvRegistry.RegisterDefaultSOAPAction(TypeInfo(DataEcho), 'hokeAction');
  InvRegistry.RegisterInvokeOptions(TypeInfo(DataEcho), ioDocument);

end. 