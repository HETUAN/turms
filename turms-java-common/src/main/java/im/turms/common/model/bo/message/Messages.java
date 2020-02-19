// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: model/message/messages.proto

package im.turms.common.model.bo.message;

/**
 * Protobuf type {@code im.turms.proto.Messages}
 */
public  final class Messages extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:im.turms.proto.Messages)
    MessagesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Messages.newBuilder() to construct.
  private Messages(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Messages() {
    messages_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Messages();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Messages(
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
              messages_ = new java.util.ArrayList<im.turms.common.model.bo.message.Message>();
              mutable_bitField0_ |= 0x00000001;
            }
            messages_.add(
                input.readMessage(im.turms.common.model.bo.message.Message.parser(), extensionRegistry));
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
        messages_ = java.util.Collections.unmodifiableList(messages_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return im.turms.common.model.bo.message.MessagesOuterClass.internal_static_im_turms_proto_Messages_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return im.turms.common.model.bo.message.MessagesOuterClass.internal_static_im_turms_proto_Messages_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            im.turms.common.model.bo.message.Messages.class, im.turms.common.model.bo.message.Messages.Builder.class);
  }

  public static final int MESSAGES_FIELD_NUMBER = 1;
  private java.util.List<im.turms.common.model.bo.message.Message> messages_;
  /**
   * <code>repeated .im.turms.proto.Message messages = 1;</code>
   */
  public java.util.List<im.turms.common.model.bo.message.Message> getMessagesList() {
    return messages_;
  }
  /**
   * <code>repeated .im.turms.proto.Message messages = 1;</code>
   */
  public java.util.List<? extends im.turms.common.model.bo.message.MessageOrBuilder> 
      getMessagesOrBuilderList() {
    return messages_;
  }
  /**
   * <code>repeated .im.turms.proto.Message messages = 1;</code>
   */
  public int getMessagesCount() {
    return messages_.size();
  }
  /**
   * <code>repeated .im.turms.proto.Message messages = 1;</code>
   */
  public im.turms.common.model.bo.message.Message getMessages(int index) {
    return messages_.get(index);
  }
  /**
   * <code>repeated .im.turms.proto.Message messages = 1;</code>
   */
  public im.turms.common.model.bo.message.MessageOrBuilder getMessagesOrBuilder(
      int index) {
    return messages_.get(index);
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
    for (int i = 0; i < messages_.size(); i++) {
      output.writeMessage(1, messages_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < messages_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, messages_.get(i));
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
    if (!(obj instanceof im.turms.common.model.bo.message.Messages)) {
      return super.equals(obj);
    }
    im.turms.common.model.bo.message.Messages other = (im.turms.common.model.bo.message.Messages) obj;

    if (!getMessagesList()
        .equals(other.getMessagesList())) return false;
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
    if (getMessagesCount() > 0) {
      hash = (37 * hash) + MESSAGES_FIELD_NUMBER;
      hash = (53 * hash) + getMessagesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static im.turms.common.model.bo.message.Messages parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static im.turms.common.model.bo.message.Messages parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static im.turms.common.model.bo.message.Messages parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static im.turms.common.model.bo.message.Messages parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static im.turms.common.model.bo.message.Messages parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static im.turms.common.model.bo.message.Messages parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static im.turms.common.model.bo.message.Messages parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static im.turms.common.model.bo.message.Messages parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static im.turms.common.model.bo.message.Messages parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static im.turms.common.model.bo.message.Messages parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static im.turms.common.model.bo.message.Messages parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static im.turms.common.model.bo.message.Messages parseFrom(
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
  public static Builder newBuilder(im.turms.common.model.bo.message.Messages prototype) {
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
   * Protobuf type {@code im.turms.proto.Messages}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:im.turms.proto.Messages)
      im.turms.common.model.bo.message.MessagesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return im.turms.common.model.bo.message.MessagesOuterClass.internal_static_im_turms_proto_Messages_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return im.turms.common.model.bo.message.MessagesOuterClass.internal_static_im_turms_proto_Messages_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              im.turms.common.model.bo.message.Messages.class, im.turms.common.model.bo.message.Messages.Builder.class);
    }

    // Construct using im.turms.common.model.bo.message.Messages.newBuilder()
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
        getMessagesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (messagesBuilder_ == null) {
        messages_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        messagesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return im.turms.common.model.bo.message.MessagesOuterClass.internal_static_im_turms_proto_Messages_descriptor;
    }

    @java.lang.Override
    public im.turms.common.model.bo.message.Messages getDefaultInstanceForType() {
      return im.turms.common.model.bo.message.Messages.getDefaultInstance();
    }

    @java.lang.Override
    public im.turms.common.model.bo.message.Messages build() {
      im.turms.common.model.bo.message.Messages result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public im.turms.common.model.bo.message.Messages buildPartial() {
      im.turms.common.model.bo.message.Messages result = new im.turms.common.model.bo.message.Messages(this);
      int from_bitField0_ = bitField0_;
      if (messagesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          messages_ = java.util.Collections.unmodifiableList(messages_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.messages_ = messages_;
      } else {
        result.messages_ = messagesBuilder_.build();
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
      if (other instanceof im.turms.common.model.bo.message.Messages) {
        return mergeFrom((im.turms.common.model.bo.message.Messages)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(im.turms.common.model.bo.message.Messages other) {
      if (other == im.turms.common.model.bo.message.Messages.getDefaultInstance()) return this;
      if (messagesBuilder_ == null) {
        if (!other.messages_.isEmpty()) {
          if (messages_.isEmpty()) {
            messages_ = other.messages_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMessagesIsMutable();
            messages_.addAll(other.messages_);
          }
          onChanged();
        }
      } else {
        if (!other.messages_.isEmpty()) {
          if (messagesBuilder_.isEmpty()) {
            messagesBuilder_.dispose();
            messagesBuilder_ = null;
            messages_ = other.messages_;
            bitField0_ = (bitField0_ & ~0x00000001);
            messagesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getMessagesFieldBuilder() : null;
          } else {
            messagesBuilder_.addAllMessages(other.messages_);
          }
        }
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
      im.turms.common.model.bo.message.Messages parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (im.turms.common.model.bo.message.Messages) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<im.turms.common.model.bo.message.Message> messages_ =
      java.util.Collections.emptyList();
    private void ensureMessagesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        messages_ = new java.util.ArrayList<im.turms.common.model.bo.message.Message>(messages_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        im.turms.common.model.bo.message.Message, im.turms.common.model.bo.message.Message.Builder, im.turms.common.model.bo.message.MessageOrBuilder> messagesBuilder_;

    /**
     * <code>repeated .im.turms.proto.Message messages = 1;</code>
     */
    public java.util.List<im.turms.common.model.bo.message.Message> getMessagesList() {
      if (messagesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(messages_);
      } else {
        return messagesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .im.turms.proto.Message messages = 1;</code>
     */
    public int getMessagesCount() {
      if (messagesBuilder_ == null) {
        return messages_.size();
      } else {
        return messagesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .im.turms.proto.Message messages = 1;</code>
     */
    public im.turms.common.model.bo.message.Message getMessages(int index) {
      if (messagesBuilder_ == null) {
        return messages_.get(index);
      } else {
        return messagesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .im.turms.proto.Message messages = 1;</code>
     */
    public Builder setMessages(
        int index, im.turms.common.model.bo.message.Message value) {
      if (messagesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMessagesIsMutable();
        messages_.set(index, value);
        onChanged();
      } else {
        messagesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .im.turms.proto.Message messages = 1;</code>
     */
    public Builder setMessages(
        int index, im.turms.common.model.bo.message.Message.Builder builderForValue) {
      if (messagesBuilder_ == null) {
        ensureMessagesIsMutable();
        messages_.set(index, builderForValue.build());
        onChanged();
      } else {
        messagesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .im.turms.proto.Message messages = 1;</code>
     */
    public Builder addMessages(im.turms.common.model.bo.message.Message value) {
      if (messagesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMessagesIsMutable();
        messages_.add(value);
        onChanged();
      } else {
        messagesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .im.turms.proto.Message messages = 1;</code>
     */
    public Builder addMessages(
        int index, im.turms.common.model.bo.message.Message value) {
      if (messagesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMessagesIsMutable();
        messages_.add(index, value);
        onChanged();
      } else {
        messagesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .im.turms.proto.Message messages = 1;</code>
     */
    public Builder addMessages(
        im.turms.common.model.bo.message.Message.Builder builderForValue) {
      if (messagesBuilder_ == null) {
        ensureMessagesIsMutable();
        messages_.add(builderForValue.build());
        onChanged();
      } else {
        messagesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .im.turms.proto.Message messages = 1;</code>
     */
    public Builder addMessages(
        int index, im.turms.common.model.bo.message.Message.Builder builderForValue) {
      if (messagesBuilder_ == null) {
        ensureMessagesIsMutable();
        messages_.add(index, builderForValue.build());
        onChanged();
      } else {
        messagesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .im.turms.proto.Message messages = 1;</code>
     */
    public Builder addAllMessages(
        java.lang.Iterable<? extends im.turms.common.model.bo.message.Message> values) {
      if (messagesBuilder_ == null) {
        ensureMessagesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, messages_);
        onChanged();
      } else {
        messagesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .im.turms.proto.Message messages = 1;</code>
     */
    public Builder clearMessages() {
      if (messagesBuilder_ == null) {
        messages_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        messagesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .im.turms.proto.Message messages = 1;</code>
     */
    public Builder removeMessages(int index) {
      if (messagesBuilder_ == null) {
        ensureMessagesIsMutable();
        messages_.remove(index);
        onChanged();
      } else {
        messagesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .im.turms.proto.Message messages = 1;</code>
     */
    public im.turms.common.model.bo.message.Message.Builder getMessagesBuilder(
        int index) {
      return getMessagesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .im.turms.proto.Message messages = 1;</code>
     */
    public im.turms.common.model.bo.message.MessageOrBuilder getMessagesOrBuilder(
        int index) {
      if (messagesBuilder_ == null) {
        return messages_.get(index);  } else {
        return messagesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .im.turms.proto.Message messages = 1;</code>
     */
    public java.util.List<? extends im.turms.common.model.bo.message.MessageOrBuilder> 
         getMessagesOrBuilderList() {
      if (messagesBuilder_ != null) {
        return messagesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(messages_);
      }
    }
    /**
     * <code>repeated .im.turms.proto.Message messages = 1;</code>
     */
    public im.turms.common.model.bo.message.Message.Builder addMessagesBuilder() {
      return getMessagesFieldBuilder().addBuilder(
          im.turms.common.model.bo.message.Message.getDefaultInstance());
    }
    /**
     * <code>repeated .im.turms.proto.Message messages = 1;</code>
     */
    public im.turms.common.model.bo.message.Message.Builder addMessagesBuilder(
        int index) {
      return getMessagesFieldBuilder().addBuilder(
          index, im.turms.common.model.bo.message.Message.getDefaultInstance());
    }
    /**
     * <code>repeated .im.turms.proto.Message messages = 1;</code>
     */
    public java.util.List<im.turms.common.model.bo.message.Message.Builder> 
         getMessagesBuilderList() {
      return getMessagesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        im.turms.common.model.bo.message.Message, im.turms.common.model.bo.message.Message.Builder, im.turms.common.model.bo.message.MessageOrBuilder> 
        getMessagesFieldBuilder() {
      if (messagesBuilder_ == null) {
        messagesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            im.turms.common.model.bo.message.Message, im.turms.common.model.bo.message.Message.Builder, im.turms.common.model.bo.message.MessageOrBuilder>(
                messages_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        messages_ = null;
      }
      return messagesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:im.turms.proto.Messages)
  }

  // @@protoc_insertion_point(class_scope:im.turms.proto.Messages)
  private static final im.turms.common.model.bo.message.Messages DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new im.turms.common.model.bo.message.Messages();
  }

  public static im.turms.common.model.bo.message.Messages getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Messages>
      PARSER = new com.google.protobuf.AbstractParser<Messages>() {
    @java.lang.Override
    public Messages parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Messages(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Messages> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Messages> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public im.turms.common.model.bo.message.Messages getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

