using ZXing;
using ZXing.QrCode;
private static Color32[] Encode(string textForEncoding, int width, int height) {
  var writer = new BarcodeWriter {
    Format = BarcodeFormat.QR_CODE,
    Options = new QrCodeEncodingOptions {
      Height = height,
      Width = width
    }
  };
  return writer.Write(textForEncoding);
}

public Texture2D generateQR(string text) {
  var encoded = new Texture2D (256, 256);
  var color32 = Encode(text, encoded.width, encoded.height);
  encoded.SetPixels32(color32);
  encoded.Apply();
  return encoded;
}

Texture2D myQR = generateQR("Sakura Flats");
if (GUI.Button (new Rect (300, 300, 256, 256), myQR, GUIStyle.none)) {}