// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: request/group/blacklist/query_group_blacklisted_users_infos_request.proto

package im.turms.common.model.dto.request.group.blacklist;

public final class QueryGroupBlacklistedUsersInfosRequestOuterClass {
  private QueryGroupBlacklistedUsersInfosRequestOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_im_turms_proto_QueryGroupBlacklistedUsersInfosRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_im_turms_proto_QueryGroupBlacklistedUsersInfosRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nIrequest/group/blacklist/query_group_bl" +
      "acklisted_users_infos_request.proto\022\016im." +
      "turms.proto\032\036google/protobuf/wrappers.pr" +
      "oto\"r\n&QueryGroupBlacklistedUsersInfosRe" +
      "quest\022\020\n\010group_id\030\001 \001(\003\0226\n\021last_updated_" +
      "date\030\002 \001(\0132\033.google.protobuf.Int64ValueB" +
      "5\n1im.turms.common.model.dto.request.gro" +
      "up.blacklistP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.WrappersProto.getDescriptor(),
        });
    internal_static_im_turms_proto_QueryGroupBlacklistedUsersInfosRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_im_turms_proto_QueryGroupBlacklistedUsersInfosRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_im_turms_proto_QueryGroupBlacklistedUsersInfosRequest_descriptor,
        new java.lang.String[] { "GroupId", "LastUpdatedDate", });
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
