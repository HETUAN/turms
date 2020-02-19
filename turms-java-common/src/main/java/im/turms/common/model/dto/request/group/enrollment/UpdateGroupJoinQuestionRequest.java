// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: request/group/enrollment/update_group_join_question_request.proto

package im.turms.common.model.dto.request.group.enrollment;

/**
 * Protobuf type {@code im.turms.proto.UpdateGroupJoinQuestionRequest}
 */
public  final class UpdateGroupJoinQuestionRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:im.turms.proto.UpdateGroupJoinQuestionRequest)
    UpdateGroupJoinQuestionRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateGroupJoinQuestionRequest.newBuilder() to construct.
  private UpdateGroupJoinQuestionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateGroupJoinQuestionRequest() {
    answers_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateGroupJoinQuestionRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UpdateGroupJoinQuestionRequest(
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
          case 8: {

            questionId_ = input.readInt64();
            break;
          }
          case 18: {
            com.google.protobuf.StringValue.Builder subBuilder = null;
            if (question_ != null) {
              subBuilder = question_.toBuilder();
            }
            question_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(question_);
              question_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              answers_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            answers_.add(s);
            break;
          }
          case 34: {
            com.google.protobuf.Int32Value.Builder subBuilder = null;
            if (score_ != null) {
              subBuilder = score_.toBuilder();
            }
            score_ = input.readMessage(com.google.protobuf.Int32Value.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(score_);
              score_ = subBuilder.buildPartial();
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
        answers_ = answers_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return im.turms.common.model.dto.request.group.enrollment.UpdateGroupJoinQuestionRequestOuterClass.internal_static_im_turms_proto_UpdateGroupJoinQuestionRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return im.turms.common.model.dto.request.group.enrollment.UpdateGroupJoinQuestionRequestOuterClass.internal_static_im_turms_proto_UpdateGroupJoinQuestionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            im.turms.common.model.dto.request.group.enrollment.UpdateGroupJoinQuestionRequest.class, im.turms.common.model.dto.request.group.enrollment.UpdateGroupJoinQuestionRequest.Builder.class);
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

  public static final int QUESTION_FIELD_NUMBER = 2;
  private com.google.protobuf.StringValue question_;
  /**
   * <code>.google.protobuf.StringValue question = 2;</code>
   * @return Whether the question field is set.
   */
  public boolean hasQuestion() {
    return question_ != null;
  }
  /**
   * <code>.google.protobuf.StringValue question = 2;</code>
   * @return The question.
   */
  public com.google.protobuf.StringValue getQuestion() {
    return question_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : question_;
  }
  /**
   * <code>.google.protobuf.StringValue question = 2;</code>
   */
  public com.google.protobuf.StringValueOrBuilder getQuestionOrBuilder() {
    return getQuestion();
  }

  public static final int ANSWERS_FIELD_NUMBER = 3;
  private com.google.protobuf.LazyStringList answers_;
  /**
   * <code>repeated string answers = 3;</code>
   * @return A list containing the answers.
   */
  public com.google.protobuf.ProtocolStringList
      getAnswersList() {
    return answers_;
  }
  /**
   * <code>repeated string answers = 3;</code>
   * @return The count of answers.
   */
  public int getAnswersCount() {
    return answers_.size();
  }
  /**
   * <code>repeated string answers = 3;</code>
   * @param index The index of the element to return.
   * @return The answers at the given index.
   */
  public java.lang.String getAnswers(int index) {
    return answers_.get(index);
  }
  /**
   * <code>repeated string answers = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the answers at the given index.
   */
  public com.google.protobuf.ByteString
      getAnswersBytes(int index) {
    return answers_.getByteString(index);
  }

  public static final int SCORE_FIELD_NUMBER = 4;
  private com.google.protobuf.Int32Value score_;
  /**
   * <code>.google.protobuf.Int32Value score = 4;</code>
   * @return Whether the score field is set.
   */
  public boolean hasScore() {
    return score_ != null;
  }
  /**
   * <code>.google.protobuf.Int32Value score = 4;</code>
   * @return The score.
   */
  public com.google.protobuf.Int32Value getScore() {
    return score_ == null ? com.google.protobuf.Int32Value.getDefaultInstance() : score_;
  }
  /**
   * <code>.google.protobuf.Int32Value score = 4;</code>
   */
  public com.google.protobuf.Int32ValueOrBuilder getScoreOrBuilder() {
    return getScore();
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
    if (question_ != null) {
      output.writeMessage(2, getQuestion());
    }
    for (int i = 0; i < answers_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, answers_.getRaw(i));
    }
    if (score_ != null) {
      output.writeMessage(4, getScore());
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
    if (question_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getQuestion());
    }
    {
      int dataSize = 0;
      for (int i = 0; i < answers_.size(); i++) {
        dataSize += computeStringSizeNoTag(answers_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getAnswersList().size();
    }
    if (score_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getScore());
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
    if (!(obj instanceof im.turms.common.model.dto.request.group.enrollment.UpdateGroupJoinQuestionRequest)) {
      return super.equals(obj);
    }
    im.turms.common.model.dto.request.group.enrollment.UpdateGroupJoinQuestionRequest other = (im.turms.common.model.dto.request.group.enrollment.UpdateGroupJoinQuestionRequest) obj;

    if (getQuestionId()
        != other.getQuestionId()) return false;
    if (hasQuestion() != other.hasQuestion()) return false;
    if (hasQuestion()) {
      if (!getQuestion()
          .equals(other.getQuestion())) return false;
    }
    if (!getAnswersList()
        .equals(other.getAnswersList())) return false;
    if (hasScore() != other.hasScore()) return false;
    if (hasScore()) {
      if (!getScore()
          .equals(other.getScore())) return false;
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
    hash = (37 * hash) + QUESTION_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getQuestionId());
    if (hasQuestion()) {
      hash = (37 * hash) + QUESTION_FIELD_NUMBER;
      hash = (53 * hash) + getQuestion().hashCode();
    }
    if (getAnswersCount() > 0) {
      hash = (37 * hash) + ANSWERS_FIELD_NUMBER;
      hash = (53 * hash) + getAnswersList().hashCode();
    }
    if (hasScore()) {
      hash = (37 * hash) + SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getScore().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static im.turms.common.model.dto.request.group.enrollment.UpdateGroupJoinQuestionRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static im.turms.common.model.dto.request.group.enrollment.UpdateGroupJoinQuestionRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static im.turms.common.model.dto.request.group.enrollment.UpdateGroupJoinQuestionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static im.turms.common.model.dto.request.group.enrollment.UpdateGroupJoinQuestionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static im.turms.common.model.dto.request.group.enrollment.UpdateGroupJoinQuestionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static im.turms.common.model.dto.request.group.enrollment.UpdateGroupJoinQuestionRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static im.turms.common.model.dto.request.group.enrollment.UpdateGroupJoinQuestionRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static im.turms.common.model.dto.request.group.enrollment.UpdateGroupJoinQuestionRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static im.turms.common.model.dto.request.group.enrollment.UpdateGroupJoinQuestionRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static im.turms.common.model.dto.request.group.enrollment.UpdateGroupJoinQuestionRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static im.turms.common.model.dto.request.group.enrollment.UpdateGroupJoinQuestionRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static im.turms.common.model.dto.request.group.enrollment.UpdateGroupJoinQuestionRequest parseFrom(
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
  public static Builder newBuilder(im.turms.common.model.dto.request.group.enrollment.UpdateGroupJoinQuestionRequest prototype) {
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
   * Protobuf type {@code im.turms.proto.UpdateGroupJoinQuestionRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:im.turms.proto.UpdateGroupJoinQuestionRequest)
      im.turms.common.model.dto.request.group.enrollment.UpdateGroupJoinQuestionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return im.turms.common.model.dto.request.group.enrollment.UpdateGroupJoinQuestionRequestOuterClass.internal_static_im_turms_proto_UpdateGroupJoinQuestionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return im.turms.common.model.dto.request.group.enrollment.UpdateGroupJoinQuestionRequestOuterClass.internal_static_im_turms_proto_UpdateGroupJoinQuestionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              im.turms.common.model.dto.request.group.enrollment.UpdateGroupJoinQuestionRequest.class, im.turms.common.model.dto.request.group.enrollment.UpdateGroupJoinQuestionRequest.Builder.class);
    }

    // Construct using im.turms.common.model.dto.request.group.enrollment.UpdateGroupJoinQuestionRequest.newBuilder()
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

      if (questionBuilder_ == null) {
        question_ = null;
      } else {
        question_ = null;
        questionBuilder_ = null;
      }
      answers_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      if (scoreBuilder_ == null) {
        score_ = null;
      } else {
        score_ = null;
        scoreBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return im.turms.common.model.dto.request.group.enrollment.UpdateGroupJoinQuestionRequestOuterClass.internal_static_im_turms_proto_UpdateGroupJoinQuestionRequest_descriptor;
    }

    @java.lang.Override
    public im.turms.common.model.dto.request.group.enrollment.UpdateGroupJoinQuestionRequest getDefaultInstanceForType() {
      return im.turms.common.model.dto.request.group.enrollment.UpdateGroupJoinQuestionRequest.getDefaultInstance();
    }

    @java.lang.Override
    public im.turms.common.model.dto.request.group.enrollment.UpdateGroupJoinQuestionRequest build() {
      im.turms.common.model.dto.request.group.enrollment.UpdateGroupJoinQuestionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public im.turms.common.model.dto.request.group.enrollment.UpdateGroupJoinQuestionRequest buildPartial() {
      im.turms.common.model.dto.request.group.enrollment.UpdateGroupJoinQuestionRequest result = new im.turms.common.model.dto.request.group.enrollment.UpdateGroupJoinQuestionRequest(this);
      int from_bitField0_ = bitField0_;
      result.questionId_ = questionId_;
      if (questionBuilder_ == null) {
        result.question_ = question_;
      } else {
        result.question_ = questionBuilder_.build();
      }
      if (((bitField0_ & 0x00000001) != 0)) {
        answers_ = answers_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.answers_ = answers_;
      if (scoreBuilder_ == null) {
        result.score_ = score_;
      } else {
        result.score_ = scoreBuilder_.build();
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
      if (other instanceof im.turms.common.model.dto.request.group.enrollment.UpdateGroupJoinQuestionRequest) {
        return mergeFrom((im.turms.common.model.dto.request.group.enrollment.UpdateGroupJoinQuestionRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(im.turms.common.model.dto.request.group.enrollment.UpdateGroupJoinQuestionRequest other) {
      if (other == im.turms.common.model.dto.request.group.enrollment.UpdateGroupJoinQuestionRequest.getDefaultInstance()) return this;
      if (other.getQuestionId() != 0L) {
        setQuestionId(other.getQuestionId());
      }
      if (other.hasQuestion()) {
        mergeQuestion(other.getQuestion());
      }
      if (!other.answers_.isEmpty()) {
        if (answers_.isEmpty()) {
          answers_ = other.answers_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureAnswersIsMutable();
          answers_.addAll(other.answers_);
        }
        onChanged();
      }
      if (other.hasScore()) {
        mergeScore(other.getScore());
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
      im.turms.common.model.dto.request.group.enrollment.UpdateGroupJoinQuestionRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (im.turms.common.model.dto.request.group.enrollment.UpdateGroupJoinQuestionRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

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

    private com.google.protobuf.StringValue question_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> questionBuilder_;
    /**
     * <code>.google.protobuf.StringValue question = 2;</code>
     * @return Whether the question field is set.
     */
    public boolean hasQuestion() {
      return questionBuilder_ != null || question_ != null;
    }
    /**
     * <code>.google.protobuf.StringValue question = 2;</code>
     * @return The question.
     */
    public com.google.protobuf.StringValue getQuestion() {
      if (questionBuilder_ == null) {
        return question_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : question_;
      } else {
        return questionBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.StringValue question = 2;</code>
     */
    public Builder setQuestion(com.google.protobuf.StringValue value) {
      if (questionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        question_ = value;
        onChanged();
      } else {
        questionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue question = 2;</code>
     */
    public Builder setQuestion(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (questionBuilder_ == null) {
        question_ = builderForValue.build();
        onChanged();
      } else {
        questionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue question = 2;</code>
     */
    public Builder mergeQuestion(com.google.protobuf.StringValue value) {
      if (questionBuilder_ == null) {
        if (question_ != null) {
          question_ =
            com.google.protobuf.StringValue.newBuilder(question_).mergeFrom(value).buildPartial();
        } else {
          question_ = value;
        }
        onChanged();
      } else {
        questionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue question = 2;</code>
     */
    public Builder clearQuestion() {
      if (questionBuilder_ == null) {
        question_ = null;
        onChanged();
      } else {
        question_ = null;
        questionBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue question = 2;</code>
     */
    public com.google.protobuf.StringValue.Builder getQuestionBuilder() {
      
      onChanged();
      return getQuestionFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.StringValue question = 2;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getQuestionOrBuilder() {
      if (questionBuilder_ != null) {
        return questionBuilder_.getMessageOrBuilder();
      } else {
        return question_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : question_;
      }
    }
    /**
     * <code>.google.protobuf.StringValue question = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getQuestionFieldBuilder() {
      if (questionBuilder_ == null) {
        questionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getQuestion(),
                getParentForChildren(),
                isClean());
        question_ = null;
      }
      return questionBuilder_;
    }

    private com.google.protobuf.LazyStringList answers_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureAnswersIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        answers_ = new com.google.protobuf.LazyStringArrayList(answers_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string answers = 3;</code>
     * @return A list containing the answers.
     */
    public com.google.protobuf.ProtocolStringList
        getAnswersList() {
      return answers_.getUnmodifiableView();
    }
    /**
     * <code>repeated string answers = 3;</code>
     * @return The count of answers.
     */
    public int getAnswersCount() {
      return answers_.size();
    }
    /**
     * <code>repeated string answers = 3;</code>
     * @param index The index of the element to return.
     * @return The answers at the given index.
     */
    public java.lang.String getAnswers(int index) {
      return answers_.get(index);
    }
    /**
     * <code>repeated string answers = 3;</code>
     * @param index The index of the value to return.
     * @return The bytes of the answers at the given index.
     */
    public com.google.protobuf.ByteString
        getAnswersBytes(int index) {
      return answers_.getByteString(index);
    }
    /**
     * <code>repeated string answers = 3;</code>
     * @param index The index to set the value at.
     * @param value The answers to set.
     * @return This builder for chaining.
     */
    public Builder setAnswers(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureAnswersIsMutable();
      answers_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string answers = 3;</code>
     * @param value The answers to add.
     * @return This builder for chaining.
     */
    public Builder addAnswers(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureAnswersIsMutable();
      answers_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string answers = 3;</code>
     * @param values The answers to add.
     * @return This builder for chaining.
     */
    public Builder addAllAnswers(
        java.lang.Iterable<java.lang.String> values) {
      ensureAnswersIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, answers_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string answers = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearAnswers() {
      answers_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string answers = 3;</code>
     * @param value The bytes of the answers to add.
     * @return This builder for chaining.
     */
    public Builder addAnswersBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureAnswersIsMutable();
      answers_.add(value);
      onChanged();
      return this;
    }

    private com.google.protobuf.Int32Value score_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int32Value, com.google.protobuf.Int32Value.Builder, com.google.protobuf.Int32ValueOrBuilder> scoreBuilder_;
    /**
     * <code>.google.protobuf.Int32Value score = 4;</code>
     * @return Whether the score field is set.
     */
    public boolean hasScore() {
      return scoreBuilder_ != null || score_ != null;
    }
    /**
     * <code>.google.protobuf.Int32Value score = 4;</code>
     * @return The score.
     */
    public com.google.protobuf.Int32Value getScore() {
      if (scoreBuilder_ == null) {
        return score_ == null ? com.google.protobuf.Int32Value.getDefaultInstance() : score_;
      } else {
        return scoreBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Int32Value score = 4;</code>
     */
    public Builder setScore(com.google.protobuf.Int32Value value) {
      if (scoreBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        score_ = value;
        onChanged();
      } else {
        scoreBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Int32Value score = 4;</code>
     */
    public Builder setScore(
        com.google.protobuf.Int32Value.Builder builderForValue) {
      if (scoreBuilder_ == null) {
        score_ = builderForValue.build();
        onChanged();
      } else {
        scoreBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Int32Value score = 4;</code>
     */
    public Builder mergeScore(com.google.protobuf.Int32Value value) {
      if (scoreBuilder_ == null) {
        if (score_ != null) {
          score_ =
            com.google.protobuf.Int32Value.newBuilder(score_).mergeFrom(value).buildPartial();
        } else {
          score_ = value;
        }
        onChanged();
      } else {
        scoreBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Int32Value score = 4;</code>
     */
    public Builder clearScore() {
      if (scoreBuilder_ == null) {
        score_ = null;
        onChanged();
      } else {
        score_ = null;
        scoreBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Int32Value score = 4;</code>
     */
    public com.google.protobuf.Int32Value.Builder getScoreBuilder() {
      
      onChanged();
      return getScoreFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Int32Value score = 4;</code>
     */
    public com.google.protobuf.Int32ValueOrBuilder getScoreOrBuilder() {
      if (scoreBuilder_ != null) {
        return scoreBuilder_.getMessageOrBuilder();
      } else {
        return score_ == null ?
            com.google.protobuf.Int32Value.getDefaultInstance() : score_;
      }
    }
    /**
     * <code>.google.protobuf.Int32Value score = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int32Value, com.google.protobuf.Int32Value.Builder, com.google.protobuf.Int32ValueOrBuilder> 
        getScoreFieldBuilder() {
      if (scoreBuilder_ == null) {
        scoreBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Int32Value, com.google.protobuf.Int32Value.Builder, com.google.protobuf.Int32ValueOrBuilder>(
                getScore(),
                getParentForChildren(),
                isClean());
        score_ = null;
      }
      return scoreBuilder_;
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


    // @@protoc_insertion_point(builder_scope:im.turms.proto.UpdateGroupJoinQuestionRequest)
  }

  // @@protoc_insertion_point(class_scope:im.turms.proto.UpdateGroupJoinQuestionRequest)
  private static final im.turms.common.model.dto.request.group.enrollment.UpdateGroupJoinQuestionRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new im.turms.common.model.dto.request.group.enrollment.UpdateGroupJoinQuestionRequest();
  }

  public static im.turms.common.model.dto.request.group.enrollment.UpdateGroupJoinQuestionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateGroupJoinQuestionRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateGroupJoinQuestionRequest>() {
    @java.lang.Override
    public UpdateGroupJoinQuestionRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UpdateGroupJoinQuestionRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpdateGroupJoinQuestionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateGroupJoinQuestionRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public im.turms.common.model.dto.request.group.enrollment.UpdateGroupJoinQuestionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

