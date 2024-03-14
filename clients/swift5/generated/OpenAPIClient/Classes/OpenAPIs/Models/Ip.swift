//
// Ip.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct Ip: Codable, JSONEncodable, Hashable {

    public var ip: String

    public init(ip: String) {
        self.ip = ip
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case ip
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(ip, forKey: .ip)
    }
}
