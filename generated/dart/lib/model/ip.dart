part of openapi.api;

class Ip {
  
  String ip = null;
  Ip();

  @override
  String toString() {
    return 'Ip[ip=$ip, ]';
  }

  Ip.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    ip = json['ip'];
  }

  Map<String, dynamic> toJson() {
    return {
      'ip': ip
    };
  }

  static List<Ip> listFromJson(List<dynamic> json) {
    return json == null ? new List<Ip>() : json.map((value) => new Ip.fromJson(value)).toList();
  }

  static Map<String, Ip> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, Ip>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new Ip.fromJson(value));
    }
    return map;
  }
}

