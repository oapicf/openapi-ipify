//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'get_ip200_response.g.dart';

/// GetIp200Response
///
/// Properties:
/// * [ip] 
@BuiltValue()
abstract class GetIp200Response implements Built<GetIp200Response, GetIp200ResponseBuilder> {
  @BuiltValueField(wireName: r'ip')
  String? get ip;

  GetIp200Response._();

  factory GetIp200Response([void updates(GetIp200ResponseBuilder b)]) = _$GetIp200Response;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(GetIp200ResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<GetIp200Response> get serializer => _$GetIp200ResponseSerializer();
}

class _$GetIp200ResponseSerializer implements PrimitiveSerializer<GetIp200Response> {
  @override
  final Iterable<Type> types = const [GetIp200Response, _$GetIp200Response];

  @override
  final String wireName = r'GetIp200Response';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    GetIp200Response object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.ip != null) {
      yield r'ip';
      yield serializers.serialize(
        object.ip,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    GetIp200Response object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required GetIp200ResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'ip':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.ip = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  GetIp200Response deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = GetIp200ResponseBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

