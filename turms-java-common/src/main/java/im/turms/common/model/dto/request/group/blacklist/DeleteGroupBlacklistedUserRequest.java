// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: request/group/blacklist/delete_group_blacklisted_user_request.proto

package im.turms.common.model.dto.request.group.blacklist;

/**
 * Protobuf type {@code im.turms.proto.DeleteGroupBlacklistedUserRequest}
 */
public  final class DeleteGroupBlacklistedUserRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:im.turms.proto.DeleteGroupBlacklistedUserRequest)
    DeleteGroupBlacklistedUserRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeleteGroupBlacklistedUserRequest.newBuilder() to construct.
  private DeleteGroupBlacklistedUserRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeleteGroupBlacklistedUserRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DeleteGroupBlacklistedUserRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DeleteGroupBlacklistedUserRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            groupId_ = input.readInt64();
            break;
          }
          case 16: {

            unblacklistedUserId_ = input.readInt64();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return im.turms.common.model.dto.request.group.blacklist.DeleteGroupBlacklistedUserRequestOuterClass.internal_static_im_turms_proto_DeleteGroupBlacklistedUserRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return im.turms.common.model.dto.request.group.blacklist.DeleteGroupBlacklistedUserRequestOuterClass.internal_static_im_turms_proto_DeleteGroupBlacklistedUserRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            im.turms.common.model.dto.request.group.blacklist.DeleteGroupBlacklistedUserRequest.class, im.turms.common.model.dto.request.group.blacklist.DeleteGroupBlacklistedUserRequest.Builder.class);
  }

  public static final int GROUP_ID_FIELD_NUMBER = 1;
  private long groupId_;
  /**
   * <code>int64 group_id = 1;</code>
   * @return The groupId.
   */
  public long getGroupId() {
    return groupId_;
  }

  public static final int UNBLACKLISTED_USER_ID_FIELD_NUMBER = 2;
  private long unblacklistedUserId_;
  /**
   * <code>int64 unblacklisted_user_id = 2;</code>
   * @return The unblacklistedUserId.
   */
  public long getUnblacklistedUserId() {
    return unblacklistedUserId_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (groupId_ != 0L) {
      output.writeInt64(1, groupId_);
    }
    if (unblacklistedUserId_ != 0L) {
      output.writeInt64(2, unblacklistedUserId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (groupId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, groupId_);
    }
    if (unblacklistedUserId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, unblacklistedUserId_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof im.turms.common.model.dto.request.group.blacklist.DeleteGroupBlacklistedUserRequest)) {
      return super.equals(obj);
    }
    im.turms.common.model.dto.request.group.blacklist.DeleteGroupBlacklistedUserRequest other = (im.turms.common.model.dto.request.group.blacklist.DeleteGroupBlacklistedUserRequest) obj;

    if (getGroupId()
        != other.getGroupId()) return false;
    if (getUnblacklistedUserId()
        != other.getUnblacklistedUserId()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + GROUP_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getGroupId());
    hash = (37 * hash) + UNBLACKLISTED_USER_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getUnblacklistedUserId());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static im.turms.common.model.dto.request.group.blacklist.DeleteGroupBlacklistedUserRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static im.turms.common.model.dto.request.group.blacklist.DeleteGroupBlacklistedUserRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static im.turms.common.model.dto.request.group.blacklist.DeleteGroupBlacklistedUserRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static im.turms.common.model.dto.request.group.blacklist.DeleteGroupBlacklistedUserRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static im.turms.common.model.dto.request.group.blacklist.DeleteGroupBlacklistedUserRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static im.turms.common.model.dto.request.group.blacklist.DeleteGroupBlacklistedUserRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static im.turms.common.model.dto.request.group.blacklist.DeleteGroupBlacklistedUserRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static im.turms.common.model.dto.request.group.blacklist.DeleteGroupBlacklistedUserRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static im.turms.common.model.dto.request.group.blacklist.DeleteGroupBlacklistedUserRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static im.turms.common.model.dto.request.group.blacklist.DeleteGroupBlacklistedUserRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static im.turms.common.model.dto.request.group.blacklist.DeleteGroupBlacklistedUserRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static im.turms.common.model.dto.request.group.blacklist.DeleteGroupBlacklistedUserRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(im.turms.common.model.dto.request.group.blacklist.DeleteGroupBlacklistedUserRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code im.turms.proto.DeleteGroupBlacklistedUserRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:im.turms.proto.DeleteGroupBlacklistedUserRequest)
      im.turms.common.model.dto.request.group.blacklist.DeleteGroupBlacklistedUserRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return im.turms.common.model.dto.request.group.blacklist.DeleteGroupBlacklistedUserRequestOuterClass.internal_static_im_turms_proto_DeleteGroupBlacklistedUserRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return im.turms.common.model.dto.request.group.blacklist.DeleteGroupBlacklistedUserRequestOuterClass.internal_static_im_turms_proto_DeleteGroupBlacklistedUserRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              im.turms.common.model.dto.request.group.blacklist.DeleteGroupBlacklistedUserRequest.class, im.turms.common.model.dto.request.group.blacklist.DeleteGroupBlacklistedUserRequest.Builder.class);
    }

    // Construct using im.turms.common.model.dto.request.group.blacklist.DeleteGroupBlacklistedUserRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      groupId_ = 0L;

      unblacklistedUserId_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return im.turms.common.model.dto.request.group.blacklist.DeleteGroupBlacklistedUserRequestOuterClass.internal_static_im_turms_proto_DeleteGroupBlacklistedUserRequest_descriptor;
    }

    @java.lang.Override
    public im.turms.common.model.dto.request.group.blacklist.DeleteGroupBlacklistedUserRequest getDefaultInstanceForType() {
      return im.turms.common.model.dto.request.group.blacklist.DeleteGroupBlacklistedUserRequest.getDefaultInstance();
    }

    @java.lang.Override
    public im.turms.common.model.dto.request.group.blacklist.DeleteGroupBlacklistedUserRequest build() {
      im.turms.common.model.dto.request.group.blacklist.DeleteGroupBlacklistedUserRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public im.turms.common.model.dto.request.group.blacklist.DeleteGroupBlacklistedUserRequest buildPartial() {
      im.turms.common.model.dto.request.group.blacklist.DeleteGroupBlacklistedUserRequest result = new im.turms.common.model.dto.request.group.blacklist.DeleteGroupBlacklistedUserRequest(this);
      result.groupId_ = groupId_;
      result.unblacklistedUserId_ = unblacklistedUserId_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof im.turms.common.model.dto.request.group.blacklist.DeleteGroupBlacklistedUserRequest) {
        return mergeFrom((im.turms.common.model.dto.request.group.blacklist.DeleteGroupBlacklistedUserRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(im.turms.common.model.dto.request.group.blacklist.DeleteGroupBlacklistedUserRequest other) {
      if (other == im.turms.common.model.dto.request.group.blacklist.DeleteGroupBlacklistedUserRequest.getDefaultInstance()) return this;
      if (other.getGroupId() != 0L) {
        setGroupId(other.getGroupId());
      }
      if (other.getUnblacklistedUserId() != 0L) {
        setUnblacklistedUserId(other.getUnblacklistedUserId());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      im.turms.common.model.dto.request.group.blacklist.DeleteGroupBlacklistedUserRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (im.turms.common.model.dto.request.group.blacklist.DeleteGroupBlacklistedUserRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long groupId_ ;
    /**
     * <code>int64 group_id = 1;</code>
     * @return The groupId.
     */
    public long getGroupId() {
      return groupId_;
    }
    /**
     * <code>int64 group_id = 1;</code>
     * @param value The groupId to set.
     * @return This builder for chaining.
     */
    public Builder setGroupId(long value) {
      
      groupId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 group_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearGroupId() {
      
      groupId_ = 0L;
      onChanged();
      return this;
    }

    private long unblacklistedUserId_ ;
    /**
     * <code>int64 unblacklisted_user_id = 2;</code>
     * @return The unblacklistedUserId.
     */
    public long getUnblacklistedUserId() {
      return unblacklistedUserId_;
    }
    /**
     * <code>int64 unblacklisted_user_id = 2;</code>
     * @param value The unblacklistedUserId to set.
     * @return This builder for chaining.
     */
    public Builder setUnblacklistedUserId(long value) {
      
      unblacklistedUserId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 unblacklisted_user_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearUnblacklistedUserId() {
      
      unblacklistedUserId_ = 0L;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:im.turms.proto.DeleteGroupBlacklistedUserRequest)
  }

  // @@protoc_insertion_point(class_scope:im.turms.proto.DeleteGroupBlacklistedUserRequest)
  private static final im.turms.common.model.dto.request.group.blacklist.DeleteGroupBlacklistedUserRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new im.turms.common.model.dto.request.group.blacklist.DeleteGroupBlacklistedUserRequest();
  }

  public static im.turms.common.model.dto.request.group.blacklist.DeleteGroupBlacklistedUserRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeleteGroupBlacklistedUserRequest>
      PARSER = new com.google.protobuf.AbstractParser<DeleteGroupBlacklistedUserRequest>() {
    @java.lang.Override
    public DeleteGroupBlacklistedUserRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DeleteGroupBlacklistedUserRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DeleteGroupBlacklistedUserRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeleteGroupBlacklistedUserRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public im.turms.common.model.dto.request.group.blacklist.DeleteGroupBlacklistedUserRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

