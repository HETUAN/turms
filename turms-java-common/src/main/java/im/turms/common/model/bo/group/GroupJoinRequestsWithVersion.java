// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: model/group/group_join_requests_with_version.proto

package im.turms.common.model.bo.group;

/**
 * Protobuf type {@code im.turms.proto.GroupJoinRequestsWithVersion}
 */
public  final class GroupJoinRequestsWithVersion extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:im.turms.proto.GroupJoinRequestsWithVersion)
    GroupJoinRequestsWithVersionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GroupJoinRequestsWithVersion.newBuilder() to construct.
  private GroupJoinRequestsWithVersion(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GroupJoinRequestsWithVersion() {
    groupJoinRequests_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GroupJoinRequestsWithVersion();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GroupJoinRequestsWithVersion(
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
              groupJoinRequests_ = new java.util.ArrayList<im.turms.common.model.bo.group.GroupJoinRequest>();
              mutable_bitField0_ |= 0x00000001;
            }
            groupJoinRequests_.add(
                input.readMessage(im.turms.common.model.bo.group.GroupJoinRequest.parser(), extensionRegistry));
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
        groupJoinRequests_ = java.util.Collections.unmodifiableList(groupJoinRequests_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return im.turms.common.model.bo.group.GroupJoinRequestsWithVersionOuterClass.internal_static_im_turms_proto_GroupJoinRequestsWithVersion_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return im.turms.common.model.bo.group.GroupJoinRequestsWithVersionOuterClass.internal_static_im_turms_proto_GroupJoinRequestsWithVersion_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            im.turms.common.model.bo.group.GroupJoinRequestsWithVersion.class, im.turms.common.model.bo.group.GroupJoinRequestsWithVersion.Builder.class);
  }

  public static final int GROUP_JOIN_REQUESTS_FIELD_NUMBER = 1;
  private java.util.List<im.turms.common.model.bo.group.GroupJoinRequest> groupJoinRequests_;
  /**
   * <code>repeated .im.turms.proto.GroupJoinRequest group_join_requests = 1;</code>
   */
  public java.util.List<im.turms.common.model.bo.group.GroupJoinRequest> getGroupJoinRequestsList() {
    return groupJoinRequests_;
  }
  /**
   * <code>repeated .im.turms.proto.GroupJoinRequest group_join_requests = 1;</code>
   */
  public java.util.List<? extends im.turms.common.model.bo.group.GroupJoinRequestOrBuilder> 
      getGroupJoinRequestsOrBuilderList() {
    return groupJoinRequests_;
  }
  /**
   * <code>repeated .im.turms.proto.GroupJoinRequest group_join_requests = 1;</code>
   */
  public int getGroupJoinRequestsCount() {
    return groupJoinRequests_.size();
  }
  /**
   * <code>repeated .im.turms.proto.GroupJoinRequest group_join_requests = 1;</code>
   */
  public im.turms.common.model.bo.group.GroupJoinRequest getGroupJoinRequests(int index) {
    return groupJoinRequests_.get(index);
  }
  /**
   * <code>repeated .im.turms.proto.GroupJoinRequest group_join_requests = 1;</code>
   */
  public im.turms.common.model.bo.group.GroupJoinRequestOrBuilder getGroupJoinRequestsOrBuilder(
      int index) {
    return groupJoinRequests_.get(index);
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
    for (int i = 0; i < groupJoinRequests_.size(); i++) {
      output.writeMessage(1, groupJoinRequests_.get(i));
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
    for (int i = 0; i < groupJoinRequests_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, groupJoinRequests_.get(i));
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
    if (!(obj instanceof im.turms.common.model.bo.group.GroupJoinRequestsWithVersion)) {
      return super.equals(obj);
    }
    im.turms.common.model.bo.group.GroupJoinRequestsWithVersion other = (im.turms.common.model.bo.group.GroupJoinRequestsWithVersion) obj;

    if (!getGroupJoinRequestsList()
        .equals(other.getGroupJoinRequestsList())) return false;
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
    if (getGroupJoinRequestsCount() > 0) {
      hash = (37 * hash) + GROUP_JOIN_REQUESTS_FIELD_NUMBER;
      hash = (53 * hash) + getGroupJoinRequestsList().hashCode();
    }
    if (hasLastUpdatedDate()) {
      hash = (37 * hash) + LAST_UPDATED_DATE_FIELD_NUMBER;
      hash = (53 * hash) + getLastUpdatedDate().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static im.turms.common.model.bo.group.GroupJoinRequestsWithVersion parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static im.turms.common.model.bo.group.GroupJoinRequestsWithVersion parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static im.turms.common.model.bo.group.GroupJoinRequestsWithVersion parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static im.turms.common.model.bo.group.GroupJoinRequestsWithVersion parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static im.turms.common.model.bo.group.GroupJoinRequestsWithVersion parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static im.turms.common.model.bo.group.GroupJoinRequestsWithVersion parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static im.turms.common.model.bo.group.GroupJoinRequestsWithVersion parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static im.turms.common.model.bo.group.GroupJoinRequestsWithVersion parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static im.turms.common.model.bo.group.GroupJoinRequestsWithVersion parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static im.turms.common.model.bo.group.GroupJoinRequestsWithVersion parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static im.turms.common.model.bo.group.GroupJoinRequestsWithVersion parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static im.turms.common.model.bo.group.GroupJoinRequestsWithVersion parseFrom(
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
  public static Builder newBuilder(im.turms.common.model.bo.group.GroupJoinRequestsWithVersion prototype) {
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
   * Protobuf type {@code im.turms.proto.GroupJoinRequestsWithVersion}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:im.turms.proto.GroupJoinRequestsWithVersion)
      im.turms.common.model.bo.group.GroupJoinRequestsWithVersionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return im.turms.common.model.bo.group.GroupJoinRequestsWithVersionOuterClass.internal_static_im_turms_proto_GroupJoinRequestsWithVersion_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return im.turms.common.model.bo.group.GroupJoinRequestsWithVersionOuterClass.internal_static_im_turms_proto_GroupJoinRequestsWithVersion_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              im.turms.common.model.bo.group.GroupJoinRequestsWithVersion.class, im.turms.common.model.bo.group.GroupJoinRequestsWithVersion.Builder.class);
    }

    // Construct using im.turms.common.model.bo.group.GroupJoinRequestsWithVersion.newBuilder()
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
        getGroupJoinRequestsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (groupJoinRequestsBuilder_ == null) {
        groupJoinRequests_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        groupJoinRequestsBuilder_.clear();
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
      return im.turms.common.model.bo.group.GroupJoinRequestsWithVersionOuterClass.internal_static_im_turms_proto_GroupJoinRequestsWithVersion_descriptor;
    }

    @java.lang.Override
    public im.turms.common.model.bo.group.GroupJoinRequestsWithVersion getDefaultInstanceForType() {
      return im.turms.common.model.bo.group.GroupJoinRequestsWithVersion.getDefaultInstance();
    }

    @java.lang.Override
    public im.turms.common.model.bo.group.GroupJoinRequestsWithVersion build() {
      im.turms.common.model.bo.group.GroupJoinRequestsWithVersion result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public im.turms.common.model.bo.group.GroupJoinRequestsWithVersion buildPartial() {
      im.turms.common.model.bo.group.GroupJoinRequestsWithVersion result = new im.turms.common.model.bo.group.GroupJoinRequestsWithVersion(this);
      int from_bitField0_ = bitField0_;
      if (groupJoinRequestsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          groupJoinRequests_ = java.util.Collections.unmodifiableList(groupJoinRequests_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.groupJoinRequests_ = groupJoinRequests_;
      } else {
        result.groupJoinRequests_ = groupJoinRequestsBuilder_.build();
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
      if (other instanceof im.turms.common.model.bo.group.GroupJoinRequestsWithVersion) {
        return mergeFrom((im.turms.common.model.bo.group.GroupJoinRequestsWithVersion)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(im.turms.common.model.bo.group.GroupJoinRequestsWithVersion other) {
      if (other == im.turms.common.model.bo.group.GroupJoinRequestsWithVersion.getDefaultInstance()) return this;
      if (groupJoinRequestsBuilder_ == null) {
        if (!other.groupJoinRequests_.isEmpty()) {
          if (groupJoinRequests_.isEmpty()) {
            groupJoinRequests_ = other.groupJoinRequests_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureGroupJoinRequestsIsMutable();
            groupJoinRequests_.addAll(other.groupJoinRequests_);
          }
          onChanged();
        }
      } else {
        if (!other.groupJoinRequests_.isEmpty()) {
          if (groupJoinRequestsBuilder_.isEmpty()) {
            groupJoinRequestsBuilder_.dispose();
            groupJoinRequestsBuilder_ = null;
            groupJoinRequests_ = other.groupJoinRequests_;
            bitField0_ = (bitField0_ & ~0x00000001);
            groupJoinRequestsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getGroupJoinRequestsFieldBuilder() : null;
          } else {
            groupJoinRequestsBuilder_.addAllMessages(other.groupJoinRequests_);
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
      im.turms.common.model.bo.group.GroupJoinRequestsWithVersion parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (im.turms.common.model.bo.group.GroupJoinRequestsWithVersion) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<im.turms.common.model.bo.group.GroupJoinRequest> groupJoinRequests_ =
      java.util.Collections.emptyList();
    private void ensureGroupJoinRequestsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        groupJoinRequests_ = new java.util.ArrayList<im.turms.common.model.bo.group.GroupJoinRequest>(groupJoinRequests_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        im.turms.common.model.bo.group.GroupJoinRequest, im.turms.common.model.bo.group.GroupJoinRequest.Builder, im.turms.common.model.bo.group.GroupJoinRequestOrBuilder> groupJoinRequestsBuilder_;

    /**
     * <code>repeated .im.turms.proto.GroupJoinRequest group_join_requests = 1;</code>
     */
    public java.util.List<im.turms.common.model.bo.group.GroupJoinRequest> getGroupJoinRequestsList() {
      if (groupJoinRequestsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(groupJoinRequests_);
      } else {
        return groupJoinRequestsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .im.turms.proto.GroupJoinRequest group_join_requests = 1;</code>
     */
    public int getGroupJoinRequestsCount() {
      if (groupJoinRequestsBuilder_ == null) {
        return groupJoinRequests_.size();
      } else {
        return groupJoinRequestsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .im.turms.proto.GroupJoinRequest group_join_requests = 1;</code>
     */
    public im.turms.common.model.bo.group.GroupJoinRequest getGroupJoinRequests(int index) {
      if (groupJoinRequestsBuilder_ == null) {
        return groupJoinRequests_.get(index);
      } else {
        return groupJoinRequestsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .im.turms.proto.GroupJoinRequest group_join_requests = 1;</code>
     */
    public Builder setGroupJoinRequests(
        int index, im.turms.common.model.bo.group.GroupJoinRequest value) {
      if (groupJoinRequestsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGroupJoinRequestsIsMutable();
        groupJoinRequests_.set(index, value);
        onChanged();
      } else {
        groupJoinRequestsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .im.turms.proto.GroupJoinRequest group_join_requests = 1;</code>
     */
    public Builder setGroupJoinRequests(
        int index, im.turms.common.model.bo.group.GroupJoinRequest.Builder builderForValue) {
      if (groupJoinRequestsBuilder_ == null) {
        ensureGroupJoinRequestsIsMutable();
        groupJoinRequests_.set(index, builderForValue.build());
        onChanged();
      } else {
        groupJoinRequestsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .im.turms.proto.GroupJoinRequest group_join_requests = 1;</code>
     */
    public Builder addGroupJoinRequests(im.turms.common.model.bo.group.GroupJoinRequest value) {
      if (groupJoinRequestsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGroupJoinRequestsIsMutable();
        groupJoinRequests_.add(value);
        onChanged();
      } else {
        groupJoinRequestsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .im.turms.proto.GroupJoinRequest group_join_requests = 1;</code>
     */
    public Builder addGroupJoinRequests(
        int index, im.turms.common.model.bo.group.GroupJoinRequest value) {
      if (groupJoinRequestsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGroupJoinRequestsIsMutable();
        groupJoinRequests_.add(index, value);
        onChanged();
      } else {
        groupJoinRequestsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .im.turms.proto.GroupJoinRequest group_join_requests = 1;</code>
     */
    public Builder addGroupJoinRequests(
        im.turms.common.model.bo.group.GroupJoinRequest.Builder builderForValue) {
      if (groupJoinRequestsBuilder_ == null) {
        ensureGroupJoinRequestsIsMutable();
        groupJoinRequests_.add(builderForValue.build());
        onChanged();
      } else {
        groupJoinRequestsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .im.turms.proto.GroupJoinRequest group_join_requests = 1;</code>
     */
    public Builder addGroupJoinRequests(
        int index, im.turms.common.model.bo.group.GroupJoinRequest.Builder builderForValue) {
      if (groupJoinRequestsBuilder_ == null) {
        ensureGroupJoinRequestsIsMutable();
        groupJoinRequests_.add(index, builderForValue.build());
        onChanged();
      } else {
        groupJoinRequestsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .im.turms.proto.GroupJoinRequest group_join_requests = 1;</code>
     */
    public Builder addAllGroupJoinRequests(
        java.lang.Iterable<? extends im.turms.common.model.bo.group.GroupJoinRequest> values) {
      if (groupJoinRequestsBuilder_ == null) {
        ensureGroupJoinRequestsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, groupJoinRequests_);
        onChanged();
      } else {
        groupJoinRequestsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .im.turms.proto.GroupJoinRequest group_join_requests = 1;</code>
     */
    public Builder clearGroupJoinRequests() {
      if (groupJoinRequestsBuilder_ == null) {
        groupJoinRequests_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        groupJoinRequestsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .im.turms.proto.GroupJoinRequest group_join_requests = 1;</code>
     */
    public Builder removeGroupJoinRequests(int index) {
      if (groupJoinRequestsBuilder_ == null) {
        ensureGroupJoinRequestsIsMutable();
        groupJoinRequests_.remove(index);
        onChanged();
      } else {
        groupJoinRequestsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .im.turms.proto.GroupJoinRequest group_join_requests = 1;</code>
     */
    public im.turms.common.model.bo.group.GroupJoinRequest.Builder getGroupJoinRequestsBuilder(
        int index) {
      return getGroupJoinRequestsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .im.turms.proto.GroupJoinRequest group_join_requests = 1;</code>
     */
    public im.turms.common.model.bo.group.GroupJoinRequestOrBuilder getGroupJoinRequestsOrBuilder(
        int index) {
      if (groupJoinRequestsBuilder_ == null) {
        return groupJoinRequests_.get(index);  } else {
        return groupJoinRequestsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .im.turms.proto.GroupJoinRequest group_join_requests = 1;</code>
     */
    public java.util.List<? extends im.turms.common.model.bo.group.GroupJoinRequestOrBuilder> 
         getGroupJoinRequestsOrBuilderList() {
      if (groupJoinRequestsBuilder_ != null) {
        return groupJoinRequestsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(groupJoinRequests_);
      }
    }
    /**
     * <code>repeated .im.turms.proto.GroupJoinRequest group_join_requests = 1;</code>
     */
    public im.turms.common.model.bo.group.GroupJoinRequest.Builder addGroupJoinRequestsBuilder() {
      return getGroupJoinRequestsFieldBuilder().addBuilder(
          im.turms.common.model.bo.group.GroupJoinRequest.getDefaultInstance());
    }
    /**
     * <code>repeated .im.turms.proto.GroupJoinRequest group_join_requests = 1;</code>
     */
    public im.turms.common.model.bo.group.GroupJoinRequest.Builder addGroupJoinRequestsBuilder(
        int index) {
      return getGroupJoinRequestsFieldBuilder().addBuilder(
          index, im.turms.common.model.bo.group.GroupJoinRequest.getDefaultInstance());
    }
    /**
     * <code>repeated .im.turms.proto.GroupJoinRequest group_join_requests = 1;</code>
     */
    public java.util.List<im.turms.common.model.bo.group.GroupJoinRequest.Builder> 
         getGroupJoinRequestsBuilderList() {
      return getGroupJoinRequestsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        im.turms.common.model.bo.group.GroupJoinRequest, im.turms.common.model.bo.group.GroupJoinRequest.Builder, im.turms.common.model.bo.group.GroupJoinRequestOrBuilder> 
        getGroupJoinRequestsFieldBuilder() {
      if (groupJoinRequestsBuilder_ == null) {
        groupJoinRequestsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            im.turms.common.model.bo.group.GroupJoinRequest, im.turms.common.model.bo.group.GroupJoinRequest.Builder, im.turms.common.model.bo.group.GroupJoinRequestOrBuilder>(
                groupJoinRequests_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        groupJoinRequests_ = null;
      }
      return groupJoinRequestsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:im.turms.proto.GroupJoinRequestsWithVersion)
  }

  // @@protoc_insertion_point(class_scope:im.turms.proto.GroupJoinRequestsWithVersion)
  private static final im.turms.common.model.bo.group.GroupJoinRequestsWithVersion DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new im.turms.common.model.bo.group.GroupJoinRequestsWithVersion();
  }

  public static im.turms.common.model.bo.group.GroupJoinRequestsWithVersion getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GroupJoinRequestsWithVersion>
      PARSER = new com.google.protobuf.AbstractParser<GroupJoinRequestsWithVersion>() {
    @java.lang.Override
    public GroupJoinRequestsWithVersion parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GroupJoinRequestsWithVersion(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GroupJoinRequestsWithVersion> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GroupJoinRequestsWithVersion> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public im.turms.common.model.bo.group.GroupJoinRequestsWithVersion getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

