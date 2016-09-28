object Form1: TForm1
  Left = 259
  Top = 220
  Width = 836
  Height = 447
  Caption = 'Form1'
  Color = clBtnFace
  Font.Charset = DEFAULT_CHARSET
  Font.Color = clWindowText
  Font.Height = -11
  Font.Name = 'MS Sans Serif'
  Font.Style = []
  OldCreateOrder = False
  OnCreate = FormCreate
  PixelsPerInch = 96
  TextHeight = 13
  object Label1: TLabel
    Left = 34
    Top = 35
    Width = 102
    Height = 16
    Caption = 'WSDL Address : '
    Font.Charset = DEFAULT_CHARSET
    Font.Color = clWindowText
    Font.Height = -13
    Font.Name = 'MS Sans Serif'
    Font.Style = []
    ParentFont = False
  end
  object Edit1: TEdit
    Left = 144
    Top = 32
    Width = 569
    Height = 24
    Font.Charset = DEFAULT_CHARSET
    Font.Color = clWindowText
    Font.Height = -13
    Font.Name = 'MS Sans Serif'
    Font.Style = []
    ImeName = 'Microsoft IME 2003'
    ParentFont = False
    TabOrder = 0
    Text = 'http://localhost:8088/DataEchoService/DataEchoService?wsdl'
  end
  object Button1: TButton
    Left = 736
    Top = 32
    Width = 73
    Height = 25
    Caption = 'Connect'
    Font.Charset = DEFAULT_CHARSET
    Font.Color = clWindowText
    Font.Height = -13
    Font.Name = 'MS Sans Serif'
    Font.Style = []
    ParentFont = False
    TabOrder = 1
    OnClick = Button1Click
  end
  object Button2: TButton
    Left = 48
    Top = 72
    Width = 73
    Height = 25
    Caption = 'String'
    TabOrder = 2
    OnClick = Button2Click
  end
  object Edit2: TEdit
    Left = 144
    Top = 72
    Width = 425
    Height = 24
    Font.Charset = DEFAULT_CHARSET
    Font.Color = clWindowText
    Font.Height = -13
    Font.Name = 'MS Sans Serif'
    Font.Style = []
    ImeName = 'Microsoft IME 2003'
    ParentFont = False
    TabOrder = 3
    Text = 'JEUS Test String'
  end
  object Button3: TButton
    Left = 48
    Top = 119
    Width = 73
    Height = 25
    Caption = 'Boolean'
    TabOrder = 4
    OnClick = Button3Click
  end
  object Button4: TButton
    Left = 48
    Top = 168
    Width = 73
    Height = 25
    Caption = 'Double'
    TabOrder = 5
    OnClick = Button4Click
  end
  object Edit4: TEdit
    Left = 144
    Top = 168
    Width = 425
    Height = 24
    Font.Charset = DEFAULT_CHARSET
    Font.Color = clWindowText
    Font.Height = -13
    Font.Name = 'MS Sans Serif'
    Font.Style = []
    ImeName = 'Microsoft IME 2003'
    ParentFont = False
    TabOrder = 6
    Text = '2555.2328'
  end
  object Button5: TButton
    Left = 48
    Top = 208
    Width = 73
    Height = 25
    Caption = 'Float'
    TabOrder = 7
    OnClick = Button5Click
  end
  object Edit5: TEdit
    Left = 144
    Top = 208
    Width = 425
    Height = 24
    Font.Charset = DEFAULT_CHARSET
    Font.Color = clWindowText
    Font.Height = -13
    Font.Name = 'MS Sans Serif'
    Font.Style = []
    ImeName = 'Microsoft IME 2003'
    ParentFont = False
    TabOrder = 8
    Text = '23.1'
  end
  object Button6: TButton
    Left = 48
    Top = 248
    Width = 73
    Height = 25
    Caption = 'Integer'
    TabOrder = 9
    OnClick = Button6Click
  end
  object Edit6: TEdit
    Left = 144
    Top = 248
    Width = 425
    Height = 24
    Font.Charset = DEFAULT_CHARSET
    Font.Color = clWindowText
    Font.Height = -13
    Font.Name = 'MS Sans Serif'
    Font.Style = []
    ImeName = 'Microsoft IME 2003'
    ParentFont = False
    TabOrder = 10
    Text = '-688237'
  end
  object Button7: TButton
    Left = 48
    Top = 288
    Width = 73
    Height = 25
    Caption = 'Decimal'
    TabOrder = 11
    OnClick = Button7Click
  end
  object Edit7: TEdit
    Left = 144
    Top = 288
    Width = 425
    Height = 24
    Font.Charset = DEFAULT_CHARSET
    Font.Color = clWindowText
    Font.Height = -13
    Font.Name = 'MS Sans Serif'
    Font.Style = []
    ImeName = 'Microsoft IME 2003'
    ParentFont = False
    TabOrder = 12
    Text = '-234552'
  end
  object Button8: TButton
    Left = 48
    Top = 328
    Width = 73
    Height = 25
    Caption = 'Byte'
    TabOrder = 13
    OnClick = Button8Click
  end
  object Edit8: TEdit
    Left = 144
    Top = 328
    Width = 425
    Height = 24
    Font.Charset = DEFAULT_CHARSET
    Font.Color = clWindowText
    Font.Height = -13
    Font.Name = 'MS Sans Serif'
    Font.Style = []
    ImeName = 'Microsoft IME 2003'
    ParentFont = False
    TabOrder = 14
    Text = '111'
  end
  object Button9: TButton
    Left = 48
    Top = 368
    Width = 73
    Height = 25
    Caption = 'Datetime'
    TabOrder = 15
    OnClick = Button9Click
  end
  object Edit9: TEdit
    Left = 144
    Top = 368
    Width = 425
    Height = 24
    Font.Charset = DEFAULT_CHARSET
    Font.Color = clWindowText
    Font.Height = -13
    Font.Name = 'MS Sans Serif'
    Font.Style = []
    ImeName = 'Microsoft IME 2003'
    ParentFont = False
    TabOrder = 16
    Text = '2002-10-10T12:00:00-05:00'
  end
  object CheckBox1: TCheckBox
    Left = 146
    Top = 116
    Width = 167
    Height = 29
    Caption = 'Boolean Value(True or False)'
    Checked = True
    State = cbChecked
    TabOrder = 17
  end
  object HTTPRIO1: THTTPRIO
    HTTPWebNode.Agent = 'Borland SOAP 1.2'
    HTTPWebNode.UseUTF8InHeader = False
    HTTPWebNode.InvokeOptions = [soIgnoreInvalidCerts, soAutoCheckAccessPointViaUDDI]
    Converter.Options = [soSendMultiRefObj, soTryAllSchema, soRootRefNodesToBody, soCacheMimeResponse, soUTF8EncodeXML]
    Left = 696
    Top = 360
  end
end
