// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: model/user/user_relationships_with_version.proto

package im.turms.common.model.bo.user;

/**
 * Protobuf type {@code im.turms.proto.UserRelationshipsWithVersion}
 */
public  final class UserRelationshipsWithVersion extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:im.turms.proto.UserRelationshipsWithVersion)
    UserRelationshipsWithVersionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UserRelationshipsWithVersion.newBuilder() to construct.
  private UserRelationshipsWithVersion(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UserRelationshipsWithVersion() {
    userRelationships_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UserRelationshipsWithVersion();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UserRelationshipsWithVersion(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              userRelationships_ = new java.util.ArrayList<im.turms.common.model.bo.user.UserRelationship>();
              mutable_bitField0_ |= 0x00000001;
            }
            userRelationships_.add(
                input.readMessage(im.turms.common.model.bo.user.UserRelationship.parser(), extensionRegistry));
            break;
          }
          case 18: {
            com.google.protobuf.Int64Value.Builder subBuilder = null;
            if (lastUpdatedDate_ != null) {
              subBuilder = lastUpdatedDate_.toBuilder();
            }
            lastUpdatedDate_ = input.readMessage(com.google.protobuf.Int64Value.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(lastUpdatedDate_);
              lastUpdatedDate_ = subBuilder.buildPartial();
            }

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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        userRelationships_ = java.util.Collections.unmodifiableList(userRelationships_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return im.turms.common.model.bo.user.UserRelationshipsWithVersionOuterClass.internal_static_im_turms_proto_UserRelationshipsWithVersion_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return im.turms.common.model.bo.user.UserRelationshipsWithVersionOuterClass.internal_static_im_turms_proto_UserRelationshipsWithVersion_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            im.turms.common.model.bo.user.UserRelationshipsWithVersion.class, im.turms.common.model.bo.user.UserRelationshipsWithVersion.Builder.class);
  }

  public static final int USER_RELATIONSHIPS_FIELD_NUMBER = 1;
  private java.util.List<im.turms.common.model.bo.user.UserRelationship> userRelationships_;
  /**
   * <code>repeated .im.turms.proto.UserRelationship user_relationships = 1;</code>
   */
  public java.util.List<im.turms.common.model.bo.user.UserRelationship> getUserRelationshipsList() {
    return userRelationships_;
  }
  /**
   * <code>repeated .im.turms.proto.UserRelationship user_relationships = 1;</code>
   */
  public java.util.List<? extends im.turms.common.model.bo.user.UserRelationshipOrBuilder> 
      getUserRelationshipsOrBuilderList() {
    return userRelationships_;
  }
  /**
   * <code>repeated .im.turms.proto.UserRelationship user_relationships = 1;</code>
   */
  public int getUserRelationshipsCount() {
    return userRelationships_.size();
  }
  /**
   * <code>repeated .im.turms.proto.UserRelationship user_relationships = 1;</code>
   */
  public im.turms.common.model.bo.user.UserRelationship getUserRelationships(int index) {
    return userRelationships_.get(index);
  }
  /**
   * <code>repeated .im.turms.proto.UserRelationship user_relationships = 1;</code>
   */
  public im.turms.common.model.bo.user.UserRelationshipOrBuilder getUserRelationshipsOrBuilder(
      int index) {
    return userRelationships_.get(index);
  }

  public static final int LAST_UPDATED_DATE_FIELD_NUMBER = 2;
  private com.google.protobuf.Int64Value lastUpdatedDate_;
  /**
   * <code>.google.protobuf.Int64Value last_updated_date = 2;</code>
   * @return Whether the lastUpdatedDate field is set.
   */
  public boolean hasLastUpdatedDate() {
    return lastUpdatedDate_ != null;
  }
  /**
   * <code>.google.protobuf.Int64Value last_updated_date = 2;</code>
   * @return The lastUpdatedDate.
   */
  public com.google.protobuf.Int64Value getLastUpdatedDate() {
    return lastUpdatedDate_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : lastUpdatedDate_;
  }
  /**
   * <code>.google.protobuf.Int64Value last_updated_date = 2;</code>
   */
  public com.google.protobuf.Int64ValueOrBuilder getLastUpdatedDateOrBuilder() {
    return getLastUpdatedDate();
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
    for (int i = 0; i < userRelationships_.size(); i++) {
      output.writeMessage(1, userRelationships_.get(i));
    }
    if (lastUpdatedDate_ != null) {
      output.writeMessage(2, getLastUpdatedDate());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < userRelationships_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, userRelationships_.get(i));
    }
    if (lastUpdatedDate_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getLastUpdatedDate());
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
    if (!(obj instanceof im.turms.common.model.bo.user.UserRelationshipsWithVersion)) {
      return super.equals(obj);
    }
    im.turms.common.model.bo.user.UserRelationshipsWithVersion other = (im.turms.common.model.bo.user.UserRelationshipsWithVersion) obj;

    if (!getUserRelationshipsList()
        .equals(other.getUserRelationshipsList())) return false;
    if (hasLastUpdatedDate() != other.hasLastUpdatedDate()) return false;
    if (hasLastUpdatedDate()) {
      if (!getLastUpdatedDate()
          .equals(other.getLastUpdatedDate())) return false;
    }
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
    if (getUserRelationshipsCount() > 0) {
      hash = (37 * hash) + USER_RELATIONSHIPS_FIELD_NUMBER;
      hash = (53 * hash) + getUserRelationshipsList().hashCode();
    }
    if (hasLastUpdatedDate()) {
      hash = (37 * hash) + LAST_UPDATED_DATE_FIELD_NUMBER;
      hash = (53 * hash) + getLastUpdatedDate().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static im.turms.common.model.bo.user.UserRelationshipsWithVersion parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static im.turms.common.model.bo.user.UserRelationshipsWithVersion parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static im.turms.common.model.bo.user.UserRelationshipsWithVersion parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static im.turms.common.model.bo.user.UserRelationshipsWithVersion parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static im.turms.common.model.bo.user.UserRelationshipsWithVersion parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static im.turms.common.model.bo.user.UserRelationshipsWithVersion parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static im.turms.common.model.bo.user.UserRelationshipsWithVersion parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static im.turms.common.model.bo.user.UserRelationshipsWithVersion parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static im.turms.common.model.bo.user.UserRelationshipsWithVersion parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static im.turms.common.model.bo.user.UserRelationshipsWithVersion parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static im.turms.common.model.bo.user.UserRelationshipsWithVersion parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static im.turms.common.model.bo.user.UserRelationshipsWithVersion parseFrom(
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
  public static Builder newBuilder(im.turms.common.model.bo.user.UserRelationshipsWithVersion prototype) {
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
   * Protobuf type {@code im.turms.proto.UserRelationshipsWithVersion}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:im.turms.proto.UserRelationshipsWithVersion)
      im.turms.common.model.bo.user.UserRelationshipsWithVersionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return im.turms.common.model.bo.user.UserRelationshipsWithVersionOuterClass.internal_static_im_turms_proto_UserRelationshipsWithVersion_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return im.turms.common.model.bo.user.UserRelationshipsWithVersionOuterClass.internal_static_im_turms_proto_UserRelationshipsWithVersion_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              im.turms.common.model.bo.user.UserRelationshipsWithVersion.class, im.turms.common.model.bo.user.UserRelationshipsWithVersion.Builder.class);
    }

    // Construct using im.turms.common.model.bo.user.UserRelationshipsWithVersion.newBuilder()
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
        getUserRelationshipsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (userRelationshipsBuilder_ == null) {
        userRelationships_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        userRelationshipsBuilder_.clear();
      }
      if (lastUpdatedDateBuilder_ == null) {
        lastUpdatedDate_ = null;
      } else {
        lastUpdatedDate_ = null;
        lastUpdatedDateBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return im.turms.common.model.bo.user.UserRelationshipsWithVersionOuterClass.internal_static_im_turms_proto_UserRelationshipsWithVersion_descriptor;
    }

    @java.lang.Override
    public im.turms.common.model.bo.user.UserRelationshipsWithVersion getDefaultInstanceForType() {
      return im.turms.common.model.bo.user.UserRelationshipsWithVersion.getDefaultInstance();
    }

    @java.lang.Override
    public im.turms.common.model.bo.user.UserRelationshipsWithVersion build() {
      im.turms.common.model.bo.user.UserRelationshipsWithVersion result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public im.turms.common.model.bo.user.UserRelationshipsWithVersion buildPartial() {
      im.turms.common.model.bo.user.UserRelationshipsWithVersion result = new im.turms.common.model.bo.user.UserRelationshipsWithVersion(this);
      int from_bitField0_ = bitField0_;
      if (userRelationshipsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          userRelationships_ = java.util.Collections.unmodifiableList(userRelationships_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.userRelationships_ = userRelationships_;
      } else {
        result.userRelationships_ = userRelationshipsBuilder_.build();
      }
      if (lastUpdatedDateBuilder_ == null) {
        result.lastUpdatedDate_ = lastUpdatedDate_;
      } else {
        result.lastUpdatedDate_ = lastUpdatedDateBuilder_.build();
      }
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
      if (other instanceof im.turms.common.model.bo.user.UserRelationshipsWithVersion) {
        return mergeFrom((im.turms.common.model.bo.user.UserRelationshipsWithVersion)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(im.turms.common.model.bo.user.UserRelationshipsWithVersion other) {
      if (other == im.turms.common.model.bo.user.UserRelationshipsWithVersion.getDefaultInstance()) return this;
      if (userRelationshipsBuilder_ == null) {
        if (!other.userRelationships_.isEmpty()) {
          if (userRelationships_.isEmpty()) {
            userRelationships_ = other.userRelationships_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureUserRelationshipsIsMutable();
            userRelationships_.addAll(other.userRelationships_);
          }
          onChanged();
        }
      } else {
        if (!other.userRelationships_.isEmpty()) {
          if (userRelationshipsBuilder_.isEmpty()) {
            userRelationshipsBuilder_.dispose();
            userRelationshipsBuilder_ = null;
            userRelationships_ = other.userRelationships_;
            bitField0_ = (bitField0_ & ~0x00000001);
            userRelationshipsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getUserRelationshipsFieldBuilder() : null;
          } else {
            userRelationshipsBuilder_.addAllMessages(other.userRelationships_);
          }
        }
      }
      if (other.hasLastUpdatedDate()) {
        mergeLastUpdatedDate(other.getLastUpdatedDate());
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
      im.turms.common.model.bo.user.UserRelationshipsWithVersion parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (im.turms.common.model.bo.user.UserRelationshipsWithVersion) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<im.turms.common.model.bo.user.UserRelationship> userRelationships_ =
      java.util.Collections.emptyList();
    private void ensureUserRelationshipsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        userRelationships_ = new java.util.ArrayList<im.turms.common.model.bo.user.UserRelationship>(userRelationships_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        im.turms.common.model.bo.user.UserRelationship, im.turms.common.model.bo.user.UserRelationship.Builder, im.turms.common.model.bo.user.UserRelationshipOrBuilder> userRelationshipsBuilder_;

    /**
     * <code>repeated .im.turms.proto.UserRelationship user_relationships = 1;</code>
     */
    public java.util.List<im.turms.common.model.bo.user.UserRelationship> getUserRelationshipsList() {
      if (userRelationshipsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(userRelationships_);
      } else {
        return userRelationshipsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .im.turms.proto.UserRelationship user_relationships = 1;</code>
     */
    public int getUserRelationshipsCount() {
      if (userRelationshipsBuilder_ == null) {
        return userRelationships_.size();
      } else {
        return userRelationshipsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .im.turms.proto.UserRelationship user_relationships = 1;</code>
     */
    public im.turms.common.model.bo.user.UserRelationship getUserRelationships(int index) {
      if (userRelationshipsBuilder_ == null) {
        return userRelationships_.get(index);
      } else {
        return userRelationshipsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .im.turms.proto.UserRelationship user_relationships = 1;</code>
     */
    public Builder setUserRelationships(
        int index, im.turms.common.model.bo.user.UserRelationship value) {
      if (userRelationshipsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUserRelationshipsIsMutable();
        userRelationships_.set(index, value);
        onChanged();
      } else {
        userRelationshipsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .im.turms.proto.UserRelationship user_relationships = 1;</code>
     */
    public Builder setUserRelationships(
        int index, im.turms.common.model.bo.user.UserRelationship.Builder builderForValue) {
      if (userRelationshipsBuilder_ == null) {
        ensureUserRelationshipsIsMutable();
        userRelationships_.set(index, builderForValue.build());
        onChanged();
      } else {
        userRelationshipsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .im.turms.proto.UserRelationship user_relationships = 1;</code>
     */
    public Builder addUserRelationships(im.turms.common.model.bo.user.UserRelationship value) {
      if (userRelationshipsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUserRelationshipsIsMutable();
        userRelationships_.add(value);
        onChanged();
      } else {
        userRelationshipsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .im.turms.proto.UserRelationship user_relationships = 1;</code>
     */
    public Builder addUserRelationships(
        int index, im.turms.common.model.bo.user.UserRelationship value) {
      if (userRelationshipsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUserRelationshipsIsMutable();
        userRelationships_.add(index, value);
        onChanged();
      } else {
        userRelationshipsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .im.turms.proto.UserRelationship user_relationships = 1;</code>
     */
    public Builder addUserRelationships(
        im.turms.common.model.bo.user.UserRelationship.Builder builderForValue) {
      if (userRelationshipsBuilder_ == null) {
        ensureUserRelationshipsIsMutable();
        userRelationships_.add(builderForValue.build());
        onChanged();
      } else {
        userRelationshipsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .im.turms.proto.UserRelationship user_relationships = 1;</code>
     */
    public Builder addUserRelationships(
        int index, im.turms.common.model.bo.user.UserRelationship.Builder builderForValue) {
      if (userRelationshipsBuilder_ == null) {
        ensureUserRelationshipsIsMutable();
        userRelationships_.add(index, builderForValue.build());
        onChanged();
      } else {
        userRelationshipsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .im.turms.proto.UserRelationship user_relationships = 1;</code>
     */
    public Builder addAllUserRelationships(
        java.lang.Iterable<? extends im.turms.common.model.bo.user.UserRelationship> values) {
      if (userRelationshipsBuilder_ == null) {
        ensureUserRelationshipsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, userRelationships_);
        onChanged();
      } else {
        userRelationshipsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .im.turms.proto.UserRelationship user_relationships = 1;</code>
     */
    public Builder clearUserRelationships() {
      if (userRelationshipsBuilder_ == null) {
        userRelationships_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        userRelationshipsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .im.turms.proto.UserRelationship user_relationships = 1;</code>
     */
    public Builder removeUserRelationships(int index) {
      if (userRelationshipsBuilder_ == null) {
        ensureUserRelationshipsIsMutable();
        userRelationships_.remove(index);
        onChanged();
      } else {
        userRelationshipsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .im.turms.proto.UserRelationship user_relationships = 1;</code>
     */
    public im.turms.common.model.bo.user.UserRelationship.Builder getUserRelationshipsBuilder(
        int index) {
      return getUserRelationshipsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .im.turms.proto.UserRelationship user_relationships = 1;</code>
     */
    public im.turms.common.model.bo.user.UserRelationshipOrBuilder getUserRelationshipsOrBuilder(
        int index) {
      if (userRelationshipsBuilder_ == null) {
        return userRelationships_.get(index);  } else {
        return userRelationshipsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .im.turms.proto.UserRelationship user_relationships = 1;</code>
     */
    public java.util.List<? extends im.turms.common.model.bo.user.UserRelationshipOrBuilder> 
         getUserRelationshipsOrBuilderList() {
      if (userRelationshipsBuilder_ != null) {
        return userRelationshipsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(userRelationships_);
      }
    }
    /**
     * <code>repeated .im.turms.proto.UserRelationship user_relationships = 1;</code>
     */
    public im.turms.common.model.bo.user.UserRelationship.Builder addUserRelationshipsBuilder() {
      return getUserRelationshipsFieldBuilder().addBuilder(
          im.turms.common.model.bo.user.UserRelationship.getDefaultInstance());
    }
    /**
     * <code>repeated .im.turms.proto.UserRelationship user_relationships = 1;</code>
     */
    public im.turms.common.model.bo.user.UserRelationship.Builder addUserRelationshipsBuilder(
        int index) {
      return getUserRelationshipsFieldBuilder().addBuilder(
          index, im.turms.common.model.bo.user.UserRelationship.getDefaultInstance());
    }
    /**
     * <code>repeated .im.turms.proto.UserRelationship user_relationships = 1;</code>
     */
    public java.util.List<im.turms.common.model.bo.user.UserRelationship.Builder> 
         getUserRelationshipsBuilderList() {
      return getUserRelationshipsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        im.turms.common.model.bo.user.UserRelationship, im.turms.common.model.bo.user.UserRelationship.Builder, im.turms.common.model.bo.user.UserRelationshipOrBuilder> 
        getUserRelationshipsFieldBuilder() {
      if (userRelationshipsBuilder_ == null) {
        userRelationshipsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            im.turms.common.model.bo.user.UserRelationship, im.turms.common.model.bo.user.UserRelationship.Builder, im.turms.common.model.bo.user.UserRelationshipOrBuilder>(
                userRelationships_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        userRelationships_ = null;
      }
      return userRelationshipsBuilder_;
    }

    private com.google.protobuf.Int64Value lastUpdatedDate_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder> lastUpdatedDateBuilder_;
    /**
     * <code>.google.protobuf.Int64Value last_updated_date = 2;</code>
     * @return Whether the lastUpdatedDate field is set.
     */
    public boolean hasLastUpdatedDate() {
      return lastUpdatedDateBuilder_ != null || lastUpdatedDate_ != null;
    }
    /**
     * <code>.google.protobuf.Int64Value last_updated_date = 2;</code>
     * @return The lastUpdatedDate.
     */
    public com.google.protobuf.Int64Value getLastUpdatedDate() {
      if (lastUpdatedDateBuilder_ == null) {
        return lastUpdatedDate_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : lastUpdatedDate_;
      } else {
        return lastUpdatedDateBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Int64Value last_updated_date = 2;</code>
     */
    public Builder setLastUpdatedDate(com.google.protobuf.Int64Value value) {
      if (lastUpdatedDateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        lastUpdatedDate_ = value;
        onChanged();
      } else {
        lastUpdatedDateBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Int64Value last_updated_date = 2;</code>
     */
    public Builder setLastUpdatedDate(
        com.google.protobuf.Int64Value.Builder builderForValue) {
      if (lastUpdatedDateBuilder_ == null) {
        lastUpdatedDate_ = builderForValue.build();
        onChanged();
      } else {
        lastUpdatedDateBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Int64Value last_updated_date = 2;</code>
     */
    public Builder mergeLastUpdatedDate(com.google.protobuf.Int64Value value) {
      if (lastUpdatedDateBuilder_ == null) {
        if (lastUpdatedDate_ != null) {
          lastUpdatedDate_ =
            com.google.protobuf.Int64Value.newBuilder(lastUpdatedDate_).mergeFrom(value).buildPartial();
        } else {
          lastUpdatedDate_ = value;
        }
        onChanged();
      } else {
        lastUpdatedDateBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Int64Value last_updated_date = 2;</code>
     */
    public Builder clearLastUpdatedDate() {
      if (lastUpdatedDateBuilder_ == null) {
        lastUpdatedDate_ = null;
        onChanged();
      } else {
        lastUpdatedDate_ = null;
        lastUpdatedDateBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Int64Value last_updated_date = 2;</code>
     */
    public com.google.protobuf.Int64Value.Builder getLastUpdatedDateBuilder() {
      
      onChanged();
      return getLastUpdatedDateFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Int64Value last_updated_date = 2;</code>
     */
    public com.google.protobuf.Int64ValueOrBuilder getLastUpdatedDateOrBuilder() {
      if (lastUpdatedDateBuilder_ != null) {
        return lastUpdatedDateBuilder_.getMessageOrBuilder();
      } else {
        return lastUpdatedDate_ == null ?
            com.google.protobuf.Int64Value.getDefaultInstance() : lastUpdatedDate_;
      }
    }
    /**
     * <code>.google.protobuf.Int64Value last_updated_date = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder> 
        getLastUpdatedDateFieldBuilder() {
      if (lastUpdatedDateBuilder_ == null) {
        lastUpdatedDateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder>(
                getLastUpdatedDate(),
                getParentForChildren(),
                isClean());
        lastUpdatedDate_ = null;
      }
      return lastUpdatedDateBuilder_;
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


    // @@protoc_insertion_point(builder_scope:im.turms.proto.UserRelationshipsWithVersion)
  }

  // @@protoc_insertion_point(class_scope:im.turms.proto.UserRelationshipsWithVersion)
  private static final im.turms.common.model.bo.user.UserRelationshipsWithVersion DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new im.turms.common.model.bo.user.UserRelationshipsWithVersion();
  }

  public static im.turms.common.model.bo.user.UserRelationshipsWithVersion getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UserRelationshipsWithVersion>
      PARSER = new com.google.protobuf.AbstractParser<UserRelationshipsWithVersion>() {
    @java.lang.Override
    public UserRelationshipsWithVersion parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UserRelationshipsWithVersion(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UserRelationshipsWithVersion> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UserRelationshipsWithVersion> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public im.turms.common.model.bo.user.UserRelationshipsWithVersion getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

