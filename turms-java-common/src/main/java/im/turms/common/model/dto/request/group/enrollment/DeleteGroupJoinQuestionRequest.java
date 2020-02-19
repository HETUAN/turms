// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: request/group/enrollment/delete_group_join_question_request.proto

package im.turms.common.model.dto.request.group.enrollment;

/**
 * Protobuf type {@code im.turms.proto.DeleteGroupJoinQuestionRequest}
 */
public  final class DeleteGroupJoinQuestionRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:im.turms.proto.DeleteGroupJoinQuestionRequest)
    DeleteGroupJoinQuestionRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeleteGroupJoinQuestionRequest.newBuilder() to construct.
  private DeleteGroupJoinQuestionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeleteGroupJoinQuestionRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DeleteGroupJoinQuestionRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DeleteGroupJoinQuestionRequest(
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

            questionId_ = input.readInt64();
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
    return im.turms.common.model.dto.request.group.enrollment.DeleteGroupJoinQuestionRequestOuterClass.internal_static_im_turms_proto_DeleteGroupJoinQuestionRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return im.turms.common.model.dto.request.group.enrollment.DeleteGroupJoinQuestionRequestOuterClass.internal_static_im_turms_proto_DeleteGroupJoinQuestionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            im.turms.common.model.dto.request.group.enrollment.DeleteGroupJoinQuestionRequest.class, im.turms.common.model.dto.request.group.enrollment.DeleteGroupJoinQuestionRequest.Builder.class);
  }

  public static final int QUESTION_ID_FIELD_NUMBER = 1;
  private long questionId_;
  /**
   * <code>int64 question_id = 1;</code>
   * @return The questionId.
   */
  public long getQuestionId() {
    return questionId_;
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
    if (questionId_ != 0L) {
      output.writeInt64(1, questionId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (questionId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, questionId_);
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
    if (!(obj instanceof im.turms.common.model.dto.request.group.enrollment.DeleteGroupJoinQuestionRequest)) {
      return super.equals(obj);
    }
    im.turms.common.model.dto.request.group.enrollment.DeleteGroupJoinQuestionRequest other = (im.turms.common.model.dto.request.group.enrollment.DeleteGroupJoinQuestionRequest) obj;

    if (getQuestionId()
        != other.getQuestionId()) return false;
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
    hash = (37 * hash) + QUESTION_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getQuestionId());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static im.turms.common.model.dto.request.group.enrollment.DeleteGroupJoinQuestionRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static im.turms.common.model.dto.request.group.enrollment.DeleteGroupJoinQuestionRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static im.turms.common.model.dto.request.group.enrollment.DeleteGroupJoinQuestionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static im.turms.common.model.dto.request.group.enrollment.DeleteGroupJoinQuestionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static im.turms.common.model.dto.request.group.enrollment.DeleteGroupJoinQuestionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static im.turms.common.model.dto.request.group.enrollment.DeleteGroupJoinQuestionRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static im.turms.common.model.dto.request.group.enrollment.DeleteGroupJoinQuestionRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static im.turms.common.model.dto.request.group.enrollment.DeleteGroupJoinQuestionRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static im.turms.common.model.dto.request.group.enrollment.DeleteGroupJoinQuestionRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static im.turms.common.model.dto.request.group.enrollment.DeleteGroupJoinQuestionRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static im.turms.common.model.dto.request.group.enrollment.DeleteGroupJoinQuestionRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static im.turms.common.model.dto.request.group.enrollment.DeleteGroupJoinQuestionRequest parseFrom(
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
  public static Builder newBuilder(im.turms.common.model.dto.request.group.enrollment.DeleteGroupJoinQuestionRequest prototype) {
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
   * Protobuf type {@code im.turms.proto.DeleteGroupJoinQuestionRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:im.turms.proto.DeleteGroupJoinQuestionRequest)
      im.turms.common.model.dto.request.group.enrollment.DeleteGroupJoinQuestionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return im.turms.common.model.dto.request.group.enrollment.DeleteGroupJoinQuestionRequestOuterClass.internal_static_im_turms_proto_DeleteGroupJoinQuestionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return im.turms.common.model.dto.request.group.enrollment.DeleteGroupJoinQuestionRequestOuterClass.internal_static_im_turms_proto_DeleteGroupJoinQuestionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              im.turms.common.model.dto.request.group.enrollment.DeleteGroupJoinQuestionRequest.class, im.turms.common.model.dto.request.group.enrollment.DeleteGroupJoinQuestionRequest.Builder.class);
    }

    // Construct using im.turms.common.model.dto.request.group.enrollment.DeleteGroupJoinQuestionRequest.newBuilder()
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
      questionId_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return im.turms.common.model.dto.request.group.enrollment.DeleteGroupJoinQuestionRequestOuterClass.internal_static_im_turms_proto_DeleteGroupJoinQuestionRequest_descriptor;
    }

    @java.lang.Override
    public im.turms.common.model.dto.request.group.enrollment.DeleteGroupJoinQuestionRequest getDefaultInstanceForType() {
      return im.turms.common.model.dto.request.group.enrollment.DeleteGroupJoinQuestionRequest.getDefaultInstance();
    }

    @java.lang.Override
    public im.turms.common.model.dto.request.group.enrollment.DeleteGroupJoinQuestionRequest build() {
      im.turms.common.model.dto.request.group.enrollment.DeleteGroupJoinQuestionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public im.turms.common.model.dto.request.group.enrollment.DeleteGroupJoinQuestionRequest buildPartial() {
      im.turms.common.model.dto.request.group.enrollment.DeleteGroupJoinQuestionRequest result = new im.turms.common.model.dto.request.group.enrollment.DeleteGroupJoinQuestionRequest(this);
      result.questionId_ = questionId_;
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
      if (other instanceof im.turms.common.model.dto.request.group.enrollment.DeleteGroupJoinQuestionRequest) {
        return mergeFrom((im.turms.common.model.dto.request.group.enrollment.DeleteGroupJoinQuestionRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(im.turms.common.model.dto.request.group.enrollment.DeleteGroupJoinQuestionRequest other) {
      if (other == im.turms.common.model.dto.request.group.enrollment.DeleteGroupJoinQuestionRequest.getDefaultInstance()) return this;
      if (other.getQuestionId() != 0L) {
        setQuestionId(other.getQuestionId());
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
      im.turms.common.model.dto.request.group.enrollment.DeleteGroupJoinQuestionRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (im.turms.common.model.dto.request.group.enrollment.DeleteGroupJoinQuestionRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long questionId_ ;
    /**
     * <code>int64 question_id = 1;</code>
     * @return The questionId.
     */
    public long getQuestionId() {
      return questionId_;
    }
    /**
     * <code>int64 question_id = 1;</code>
     * @param value The questionId to set.
     * @return This builder for chaining.
     */
    public Builder setQuestionId(long value) {
      
      questionId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 question_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearQuestionId() {
      
      questionId_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:im.turms.proto.DeleteGroupJoinQuestionRequest)
  }

  // @@protoc_insertion_point(class_scope:im.turms.proto.DeleteGroupJoinQuestionRequest)
  private static final im.turms.common.model.dto.request.group.enrollment.DeleteGroupJoinQuestionRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new im.turms.common.model.dto.request.group.enrollment.DeleteGroupJoinQuestionRequest();
  }

  public static im.turms.common.model.dto.request.group.enrollment.DeleteGroupJoinQuestionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeleteGroupJoinQuestionRequest>
      PARSER = new com.google.protobuf.AbstractParser<DeleteGroupJoinQuestionRequest>() {
    @java.lang.Override
    public DeleteGroupJoinQuestionRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DeleteGroupJoinQuestionRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DeleteGroupJoinQuestionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeleteGroupJoinQuestionRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public im.turms.common.model.dto.request.group.enrollment.DeleteGroupJoinQuestionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

