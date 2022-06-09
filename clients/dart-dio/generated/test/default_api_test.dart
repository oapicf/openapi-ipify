import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for DefaultApi
void main() {
  final instance = Openapi().getDefaultApi();

  group(DefaultApi, () {
    // Get your public IP address
    //
    //Future<Ip> getIp({ String format, String callback }) async
    test('test getIp', () async {
      // TODO
    });

  });
}
