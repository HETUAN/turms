// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: request/user/relationship/update_friend_request_request.proto

package im.turms.common.model.dto.request.user.relationship;

public final class UpdateFriendRequestRequestOuterClass {
  private UpdateFriendRequestRequestOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_im_turms_proto_UpdateFriendRequestRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_im_turms_proto_UpdateFriendRequestRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n=request/user/relationship/update_frien" +
      "d_request_request.proto\022\016im.turms.proto\032" +
      "\036google/protobuf/wrappers.proto\032\036constan" +
      "t/response_action.proto\"\225\001\n\032UpdateFriend" +
      "RequestRequest\022\021\n\trequestId\030\001 \001(\003\0226\n\016res" +
      "ponseAction\030\002 \001(\0162\036.im.turms.proto.Respo" +
      "nseAction\022,\n\006reason\030\003 \001(\0132\034.google.proto" +
      "buf.StringValueB7\n3im.turms.common.model" +
      ".dto.request.user.relationshipP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.WrappersProto.getDescriptor(),
          im.turms.common.constant.ResponseActionOuterClass.getDescriptor(),
        });
    internal_static_im_turms_proto_UpdateFriendRequestRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_im_turms_proto_UpdateFriendRequestRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_im_turms_proto_UpdateFriendRequestRequest_descriptor,
        new java.lang.String[] { "RequestId", "ResponseAction", "Reason", });
    com.google.protobuf.WrappersProto.getDescriptor();
    im.turms.common.constant.ResponseActionOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
