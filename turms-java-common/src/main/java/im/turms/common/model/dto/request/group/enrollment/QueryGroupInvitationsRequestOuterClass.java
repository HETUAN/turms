// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: request/group/enrollment/query_group_invitations_request.proto

package im.turms.common.model.dto.request.group.enrollment;

public final class QueryGroupInvitationsRequestOuterClass {
  private QueryGroupInvitationsRequestOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_im_turms_proto_QueryGroupInvitationsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_im_turms_proto_QueryGroupInvitationsRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n>request/group/enrollment/query_group_i" +
      "nvitations_request.proto\022\016im.turms.proto" +
      "\032\036google/protobuf/wrappers.proto\"h\n\034Quer" +
      "yGroupInvitationsRequest\022\020\n\010group_id\030\001 \001" +
      "(\003\0226\n\021last_updated_date\030\002 \001(\0132\033.google.p" +
      "rotobuf.Int64ValueB6\n2im.turms.common.mo" +
      "del.dto.request.group.enrollmentP\001b\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.WrappersProto.getDescriptor(),
        });
    internal_static_im_turms_proto_QueryGroupInvitationsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_im_turms_proto_QueryGroupInvitationsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_im_turms_proto_QueryGroupInvitationsRequest_descriptor,
        new java.lang.String[] { "GroupId", "LastUpdatedDate", });
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
