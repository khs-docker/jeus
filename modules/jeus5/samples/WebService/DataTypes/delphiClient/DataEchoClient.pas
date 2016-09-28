unit DataEchoClient;

interface

uses
  Windows, Messages, SysUtils, Variants, Classes, Graphics, Controls, Forms,
  Dialogs, StdCtrls, InvokeRegistry, Rio, SOAPHTTPClient, XSBuiltIns,
  DataEchoService;

type
  TForm1 = class(TForm)
    Edit1: TEdit;
    Button1: TButton;
    Label1: TLabel;
    Button2: TButton;
    Edit2: TEdit;
    Button3: TButton;
    Button4: TButton;
    Edit4: TEdit;
    Button5: TButton;
    Edit5: TEdit;
    Button6: TButton;
    Edit6: TEdit;
    Button7: TButton;
    Edit7: TEdit;
    Button8: TButton;
    Edit8: TEdit;
    Button9: TButton;
    Edit9: TEdit;
    HTTPRIO1: THTTPRIO;
    CheckBox1: TCheckBox;
    procedure Button1Click(Sender: TObject);
    procedure FormCreate(Sender: TObject);
    procedure Button2Click(Sender: TObject);
    procedure Button3Click(Sender: TObject);
    procedure Button4Click(Sender: TObject);
    procedure Button5Click(Sender: TObject);
    procedure Button6Click(Sender: TObject);
    procedure Button7Click(Sender: TObject);
    procedure Button8Click(Sender: TObject);
    procedure Button9Click(Sender: TObject);
  private
    { Private declarations }
  public
    DataEchoService: DataEcho;
    { Public declarations }
  end;

var
  Form1: TForm1;

implementation

{$R *.dfm}

procedure TForm1.Button1Click(Sender: TObject);
begin
  DataEchoService := GetDataEcho(True, Edit1.Text, nil);
  ShowMessage('성공적으로 연결되었습니다.');
end;

procedure TForm1.FormCreate(Sender: TObject);
begin
  DataEchoService := GetDataEcho(True, Edit1.Text, nil);
end;

procedure TForm1.Button2Click(Sender: TObject);
var
  str: WideString;
begin
  str := DataEchoService.echoString(Edit2.Text);
  ShowMessage('String Message : ' + str);
end;

procedure TForm1.Button3Click(Sender: TObject);
var
bl: Boolean;
begin
  bl := DataEchoService.echoBoolean(CheckBox1.Checked);

  if BoolToStr(bl)='-1' then
    ShowMessage('Boolean Message : True')
  else
    ShowMessage('Boolean Message : False');

end;

procedure TForm1.Button4Click(Sender: TObject);
var
  dbl: Double;
begin
  dbl := DataEchoService.echoDouble(StrToFloat(Edit4.Text));
  ShowMessage('Double Message : ' + FloatToStr(dbl));
end;

procedure TForm1.Button5Click(Sender: TObject);
var
  slg: Single;
begin
  slg := DataEchoService.echoFloat(StrToFloat(Edit5.Text));
  ShowMessage('Float Message : ' + FloatToStr(slg));
end;

procedure TForm1.Button6Click(Sender: TObject);
var
  int1: Integer;
begin
  int1 := DataEchoService.echoInteger(StrToInt(Edit6.Text));
  ShowMessage('Integer Message : ' + IntToStr(int1));
end;

procedure TForm1.Button7Click(Sender: TObject);
var
  dec, dec2: TXSDecimal;
begin
  dec := TXSDecimal.Create;
  dec2 := TXSDecimal.Create;
  dec.XSToNative(Edit7.Text);
  dec2 := DataEchoService.echoBigDecimal(dec);
  ShowMessage('Integer Message : ' + dec2.DecimalString);
end;

procedure TForm1.Button8Click(Sender: TObject);
var
  sint: Shortint;
begin
  sint := DataEchoService.echoByte(StrToInt(Edit8.Text));
  ShowMessage('Received Byte Value : ' + IntToStr(sint));
end;
procedure TForm1.Button9Click(Sender: TObject);
var
  dat1, dat2: TXSDatetime;
begin
  dat1 := TXSDatetime.Create;
  dat2 := TXSDatetime.Create;
  dat1.XSToNative(Edit9.Text);

//  DataEchoService.echoCalendar(dat1);
  dat2 := DataEchoService.echoCalendar(dat1);
  ShowMessage('Integer Message : ' + dat2.NativeToXS());
end;


end.
