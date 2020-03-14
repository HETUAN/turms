// DO NOT EDIT.
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: model/group/group.proto
//
// For information on using the generated types, please see the documentation:
//   https://github.com/apple/swift-protobuf/

import Foundation
import SwiftProtobuf

// If the compiler emits an error on this type, it is because this file
// was generated by a version of the `protoc` Swift plug-in that is
// incompatible with the version of SwiftProtobuf to which you are linking.
// Please ensure that your are building against the same version of the API
// that was used to generate this file.
fileprivate struct _GeneratedWithProtocGenSwiftVersion: SwiftProtobuf.ProtobufAPIVersionCheck {
  struct _2: SwiftProtobuf.ProtobufAPIVersion_2 {}
  typealias Version = _2
}

public struct Group {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  public var id: SwiftProtobuf.Google_Protobuf_Int64Value {
    get {return _storage._id ?? SwiftProtobuf.Google_Protobuf_Int64Value()}
    set {_uniqueStorage()._id = newValue}
  }
  /// Returns true if `id` has been explicitly set.
  public var hasID: Bool {return _storage._id != nil}
  /// Clears the value of `id`. Subsequent reads from it will return its default value.
  public mutating func clearID() {_uniqueStorage()._id = nil}

  public var typeID: SwiftProtobuf.Google_Protobuf_Int64Value {
    get {return _storage._typeID ?? SwiftProtobuf.Google_Protobuf_Int64Value()}
    set {_uniqueStorage()._typeID = newValue}
  }
  /// Returns true if `typeID` has been explicitly set.
  public var hasTypeID: Bool {return _storage._typeID != nil}
  /// Clears the value of `typeID`. Subsequent reads from it will return its default value.
  public mutating func clearTypeID() {_uniqueStorage()._typeID = nil}

  public var creatorID: SwiftProtobuf.Google_Protobuf_Int64Value {
    get {return _storage._creatorID ?? SwiftProtobuf.Google_Protobuf_Int64Value()}
    set {_uniqueStorage()._creatorID = newValue}
  }
  /// Returns true if `creatorID` has been explicitly set.
  public var hasCreatorID: Bool {return _storage._creatorID != nil}
  /// Clears the value of `creatorID`. Subsequent reads from it will return its default value.
  public mutating func clearCreatorID() {_uniqueStorage()._creatorID = nil}

  public var ownerID: SwiftProtobuf.Google_Protobuf_Int64Value {
    get {return _storage._ownerID ?? SwiftProtobuf.Google_Protobuf_Int64Value()}
    set {_uniqueStorage()._ownerID = newValue}
  }
  /// Returns true if `ownerID` has been explicitly set.
  public var hasOwnerID: Bool {return _storage._ownerID != nil}
  /// Clears the value of `ownerID`. Subsequent reads from it will return its default value.
  public mutating func clearOwnerID() {_uniqueStorage()._ownerID = nil}

  public var name: SwiftProtobuf.Google_Protobuf_StringValue {
    get {return _storage._name ?? SwiftProtobuf.Google_Protobuf_StringValue()}
    set {_uniqueStorage()._name = newValue}
  }
  /// Returns true if `name` has been explicitly set.
  public var hasName: Bool {return _storage._name != nil}
  /// Clears the value of `name`. Subsequent reads from it will return its default value.
  public mutating func clearName() {_uniqueStorage()._name = nil}

  public var intro: SwiftProtobuf.Google_Protobuf_StringValue {
    get {return _storage._intro ?? SwiftProtobuf.Google_Protobuf_StringValue()}
    set {_uniqueStorage()._intro = newValue}
  }
  /// Returns true if `intro` has been explicitly set.
  public var hasIntro: Bool {return _storage._intro != nil}
  /// Clears the value of `intro`. Subsequent reads from it will return its default value.
  public mutating func clearIntro() {_uniqueStorage()._intro = nil}

  public var announcement: SwiftProtobuf.Google_Protobuf_StringValue {
    get {return _storage._announcement ?? SwiftProtobuf.Google_Protobuf_StringValue()}
    set {_uniqueStorage()._announcement = newValue}
  }
  /// Returns true if `announcement` has been explicitly set.
  public var hasAnnouncement: Bool {return _storage._announcement != nil}
  /// Clears the value of `announcement`. Subsequent reads from it will return its default value.
  public mutating func clearAnnouncement() {_uniqueStorage()._announcement = nil}

  public var creationDate: SwiftProtobuf.Google_Protobuf_Int64Value {
    get {return _storage._creationDate ?? SwiftProtobuf.Google_Protobuf_Int64Value()}
    set {_uniqueStorage()._creationDate = newValue}
  }
  /// Returns true if `creationDate` has been explicitly set.
  public var hasCreationDate: Bool {return _storage._creationDate != nil}
  /// Clears the value of `creationDate`. Subsequent reads from it will return its default value.
  public mutating func clearCreationDate() {_uniqueStorage()._creationDate = nil}

  public var deletionDate: SwiftProtobuf.Google_Protobuf_Int64Value {
    get {return _storage._deletionDate ?? SwiftProtobuf.Google_Protobuf_Int64Value()}
    set {_uniqueStorage()._deletionDate = newValue}
  }
  /// Returns true if `deletionDate` has been explicitly set.
  public var hasDeletionDate: Bool {return _storage._deletionDate != nil}
  /// Clears the value of `deletionDate`. Subsequent reads from it will return its default value.
  public mutating func clearDeletionDate() {_uniqueStorage()._deletionDate = nil}

  public var muteEndDate: SwiftProtobuf.Google_Protobuf_Int64Value {
    get {return _storage._muteEndDate ?? SwiftProtobuf.Google_Protobuf_Int64Value()}
    set {_uniqueStorage()._muteEndDate = newValue}
  }
  /// Returns true if `muteEndDate` has been explicitly set.
  public var hasMuteEndDate: Bool {return _storage._muteEndDate != nil}
  /// Clears the value of `muteEndDate`. Subsequent reads from it will return its default value.
  public mutating func clearMuteEndDate() {_uniqueStorage()._muteEndDate = nil}

  public var active: SwiftProtobuf.Google_Protobuf_BoolValue {
    get {return _storage._active ?? SwiftProtobuf.Google_Protobuf_BoolValue()}
    set {_uniqueStorage()._active = newValue}
  }
  /// Returns true if `active` has been explicitly set.
  public var hasActive: Bool {return _storage._active != nil}
  /// Clears the value of `active`. Subsequent reads from it will return its default value.
  public mutating func clearActive() {_uniqueStorage()._active = nil}

  public var unknownFields = SwiftProtobuf.UnknownStorage()

  public init() {}

  fileprivate var _storage = _StorageClass.defaultInstance
}

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "im.turms.proto"

extension Group: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  public static let protoMessageName: String = _protobuf_package + ".Group"
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "id"),
    2: .standard(proto: "type_id"),
    3: .standard(proto: "creator_id"),
    4: .standard(proto: "owner_id"),
    5: .same(proto: "name"),
    6: .same(proto: "intro"),
    7: .same(proto: "announcement"),
    8: .standard(proto: "creation_date"),
    9: .standard(proto: "deletion_date"),
    10: .standard(proto: "mute_end_date"),
    11: .same(proto: "active"),
  ]

  fileprivate class _StorageClass {
    var _id: SwiftProtobuf.Google_Protobuf_Int64Value? = nil
    var _typeID: SwiftProtobuf.Google_Protobuf_Int64Value? = nil
    var _creatorID: SwiftProtobuf.Google_Protobuf_Int64Value? = nil
    var _ownerID: SwiftProtobuf.Google_Protobuf_Int64Value? = nil
    var _name: SwiftProtobuf.Google_Protobuf_StringValue? = nil
    var _intro: SwiftProtobuf.Google_Protobuf_StringValue? = nil
    var _announcement: SwiftProtobuf.Google_Protobuf_StringValue? = nil
    var _creationDate: SwiftProtobuf.Google_Protobuf_Int64Value? = nil
    var _deletionDate: SwiftProtobuf.Google_Protobuf_Int64Value? = nil
    var _muteEndDate: SwiftProtobuf.Google_Protobuf_Int64Value? = nil
    var _active: SwiftProtobuf.Google_Protobuf_BoolValue? = nil

    static let defaultInstance = _StorageClass()

    private init() {}

    init(copying source: _StorageClass) {
      _id = source._id
      _typeID = source._typeID
      _creatorID = source._creatorID
      _ownerID = source._ownerID
      _name = source._name
      _intro = source._intro
      _announcement = source._announcement
      _creationDate = source._creationDate
      _deletionDate = source._deletionDate
      _muteEndDate = source._muteEndDate
      _active = source._active
    }
  }

  fileprivate mutating func _uniqueStorage() -> _StorageClass {
    if !isKnownUniquelyReferenced(&_storage) {
      _storage = _StorageClass(copying: _storage)
    }
    return _storage
  }

  public mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    _ = _uniqueStorage()
    try withExtendedLifetime(_storage) { (_storage: _StorageClass) in
      while let fieldNumber = try decoder.nextFieldNumber() {
        switch fieldNumber {
        case 1: try decoder.decodeSingularMessageField(value: &_storage._id)
        case 2: try decoder.decodeSingularMessageField(value: &_storage._typeID)
        case 3: try decoder.decodeSingularMessageField(value: &_storage._creatorID)
        case 4: try decoder.decodeSingularMessageField(value: &_storage._ownerID)
        case 5: try decoder.decodeSingularMessageField(value: &_storage._name)
        case 6: try decoder.decodeSingularMessageField(value: &_storage._intro)
        case 7: try decoder.decodeSingularMessageField(value: &_storage._announcement)
        case 8: try decoder.decodeSingularMessageField(value: &_storage._creationDate)
        case 9: try decoder.decodeSingularMessageField(value: &_storage._deletionDate)
        case 10: try decoder.decodeSingularMessageField(value: &_storage._muteEndDate)
        case 11: try decoder.decodeSingularMessageField(value: &_storage._active)
        default: break
        }
      }
    }
  }

  public func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try withExtendedLifetime(_storage) { (_storage: _StorageClass) in
      if let v = _storage._id {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
      }
      if let v = _storage._typeID {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
      }
      if let v = _storage._creatorID {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
      }
      if let v = _storage._ownerID {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 4)
      }
      if let v = _storage._name {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 5)
      }
      if let v = _storage._intro {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 6)
      }
      if let v = _storage._announcement {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 7)
      }
      if let v = _storage._creationDate {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 8)
      }
      if let v = _storage._deletionDate {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 9)
      }
      if let v = _storage._muteEndDate {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 10)
      }
      if let v = _storage._active {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 11)
      }
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  public static func ==(lhs: Group, rhs: Group) -> Bool {
    if lhs._storage !== rhs._storage {
      let storagesAreEqual: Bool = withExtendedLifetime((lhs._storage, rhs._storage)) { (_args: (_StorageClass, _StorageClass)) in
        let _storage = _args.0
        let rhs_storage = _args.1
        if _storage._id != rhs_storage._id {return false}
        if _storage._typeID != rhs_storage._typeID {return false}
        if _storage._creatorID != rhs_storage._creatorID {return false}
        if _storage._ownerID != rhs_storage._ownerID {return false}
        if _storage._name != rhs_storage._name {return false}
        if _storage._intro != rhs_storage._intro {return false}
        if _storage._announcement != rhs_storage._announcement {return false}
        if _storage._creationDate != rhs_storage._creationDate {return false}
        if _storage._deletionDate != rhs_storage._deletionDate {return false}
        if _storage._muteEndDate != rhs_storage._muteEndDate {return false}
        if _storage._active != rhs_storage._active {return false}
        return true
      }
      if !storagesAreEqual {return false}
    }
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
