// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: model/file/file.proto

package im.turms.common.model.bo.file;

public final class FileOuterClass {
  private FileOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_im_turms_proto_File_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_im_turms_proto_File_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_im_turms_proto_File_Description_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_im_turms_proto_File_Description_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025model/file/file.proto\022\016im.turms.proto\032" +
      "\036google/protobuf/wrappers.proto\"\335\001\n\004File" +
      "\0225\n\013description\030\001 \001(\0132 .im.turms.proto.F" +
      "ile.Description\022)\n\004data\030\002 \001(\0132\033.google.p" +
      "rotobuf.BytesValue\032s\n\013Description\022\013\n\003url" +
      "\030\001 \001(\t\022)\n\004size\030\002 \001(\0132\033.google.protobuf.I" +
      "nt32Value\022,\n\006format\030\003 \001(\0132\034.google.proto" +
      "buf.StringValueB!\n\035im.turms.common.model" +
      ".bo.fileP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.WrappersProto.getDescriptor(),
        });
    internal_static_im_turms_proto_File_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_im_turms_proto_File_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_im_turms_proto_File_descriptor,
        new java.lang.String[] { "Description", "Data", });
    internal_static_im_turms_proto_File_Description_descriptor =
      internal_static_im_turms_proto_File_descriptor.getNestedTypes().get(0);
    internal_static_im_turms_proto_File_Description_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_im_turms_proto_File_Description_descriptor,
        new java.lang.String[] { "Url", "Size", "Format", });
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
