program DataEcho;

uses
  Forms,
  DataEchoClient in 'DataEchoClient.pas' {Form1},
  DataEchoService in 'DataEchoService.pas';

{$R *.res}

begin
  Application.Initialize;
  Application.CreateForm(TForm1, Form1);
  Application.Run;
end.
