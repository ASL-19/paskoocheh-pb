// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: paskoocheh.proto

package org.asl19.paskoocheh;

/**
 * Protobuf type {@code org.asl19.paskoocheh.Message}
 *
 * <pre>
 * Update messages to be sent to the user
 * </pre>
 */
public final class Message extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:org.asl19.paskoocheh.Message)
    MessageOrBuilder {
  // Use Message.newBuilder() to construct.
  private Message(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
    this.unknownFields = builder.getUnknownFields();
  }
  private Message(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

  private static final Message defaultInstance;
  public static Message getDefaultInstance() {
    return defaultInstance;
  }

  public Message getDefaultInstanceForType() {
    return defaultInstance;
  }

  private final com.google.protobuf.UnknownFieldSet unknownFields;
  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
    return this.unknownFields;
  }
  private Message(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    initFields();
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
          default: {
            if (!parseUnknownField(input, unknownFields,
                                   extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            com.google.protobuf.ByteString bs = input.readBytes();
            bitField0_ |= 0x00000001;
            text_ = bs;
            break;
          }
          case 16: {
            bitField0_ |= 0x00000002;
            datePublished_ = input.readInt64();
            break;
          }
          case 24: {
            int rawValue = input.readEnum();
            org.asl19.paskoocheh.PriorityLevel value = org.asl19.paskoocheh.PriorityLevel.valueOf(rawValue);
            if (value == null) {
              unknownFields.mergeVarintField(3, rawValue);
            } else {
              bitField0_ |= 0x00000004;
              priority_ = value;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e.getMessage()).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.asl19.paskoocheh.Paskoocheh.internal_static_org_asl19_paskoocheh_Message_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.asl19.paskoocheh.Paskoocheh.internal_static_org_asl19_paskoocheh_Message_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.asl19.paskoocheh.Message.class, org.asl19.paskoocheh.Message.Builder.class);
  }

  public static com.google.protobuf.Parser<Message> PARSER =
      new com.google.protobuf.AbstractParser<Message>() {
    public Message parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Message(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public com.google.protobuf.Parser<Message> getParserForType() {
    return PARSER;
  }

  private int bitField0_;
  public static final int TEXT_FIELD_NUMBER = 1;
  private java.lang.Object text_;
  /**
   * <code>required string text = 1;</code>
   *
   * <pre>
   * Text of the message
   * </pre>
   */
  public boolean hasText() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>required string text = 1;</code>
   *
   * <pre>
   * Text of the message
   * </pre>
   */
  public java.lang.String getText() {
    java.lang.Object ref = text_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        text_ = s;
      }
      return s;
    }
  }
  /**
   * <code>required string text = 1;</code>
   *
   * <pre>
   * Text of the message
   * </pre>
   */
  public com.google.protobuf.ByteString
      getTextBytes() {
    java.lang.Object ref = text_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      text_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DATE_PUBLISHED_FIELD_NUMBER = 2;
  private long datePublished_;
  /**
   * <code>required int64 date_published = 2;</code>
   *
   * <pre>
   * Date the message published
   * </pre>
   */
  public boolean hasDatePublished() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>required int64 date_published = 2;</code>
   *
   * <pre>
   * Date the message published
   * </pre>
   */
  public long getDatePublished() {
    return datePublished_;
  }

  public static final int PRIORITY_FIELD_NUMBER = 3;
  private org.asl19.paskoocheh.PriorityLevel priority_;
  /**
   * <code>required .org.asl19.paskoocheh.PriorityLevel priority = 3;</code>
   *
   * <pre>
   * Priority of the message
   * </pre>
   */
  public boolean hasPriority() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>required .org.asl19.paskoocheh.PriorityLevel priority = 3;</code>
   *
   * <pre>
   * Priority of the message
   * </pre>
   */
  public org.asl19.paskoocheh.PriorityLevel getPriority() {
    return priority_;
  }

  private void initFields() {
    text_ = "";
    datePublished_ = 0L;
    priority_ = org.asl19.paskoocheh.PriorityLevel.HIGH;
  }
  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    if (!hasText()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!hasDatePublished()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!hasPriority()) {
      memoizedIsInitialized = 0;
      return false;
    }
    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getSerializedSize();
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeBytes(1, getTextBytes());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeInt64(2, datePublished_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeEnum(3, priority_.getNumber());
    }
    getUnknownFields().writeTo(output);
  }

  private int memoizedSerializedSize = -1;
  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, getTextBytes());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, datePublished_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, priority_.getNumber());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  protected java.lang.Object writeReplace()
      throws java.io.ObjectStreamException {
    return super.writeReplace();
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.asl19.paskoocheh.Message)) {
      return super.equals(obj);
    }
    org.asl19.paskoocheh.Message other = (org.asl19.paskoocheh.Message) obj;

    boolean result = true;
    result = result && (hasText() == other.hasText());
    if (hasText()) {
      result = result && getText()
          .equals(other.getText());
    }
    result = result && (hasDatePublished() == other.hasDatePublished());
    if (hasDatePublished()) {
      result = result && (getDatePublished()
          == other.getDatePublished());
    }
    result = result && (hasPriority() == other.hasPriority());
    if (hasPriority()) {
      result = result &&
          (getPriority() == other.getPriority());
    }
    result = result &&
        getUnknownFields().equals(other.getUnknownFields());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    if (hasText()) {
      hash = (37 * hash) + TEXT_FIELD_NUMBER;
      hash = (53 * hash) + getText().hashCode();
    }
    if (hasDatePublished()) {
      hash = (37 * hash) + DATE_PUBLISHED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getDatePublished());
    }
    if (hasPriority()) {
      hash = (37 * hash) + PRIORITY_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashEnum(
          getPriority());
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.asl19.paskoocheh.Message parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.asl19.paskoocheh.Message parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.asl19.paskoocheh.Message parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.asl19.paskoocheh.Message parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.asl19.paskoocheh.Message parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static org.asl19.paskoocheh.Message parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static org.asl19.paskoocheh.Message parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static org.asl19.paskoocheh.Message parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static org.asl19.paskoocheh.Message parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static org.asl19.paskoocheh.Message parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(org.asl19.paskoocheh.Message prototype) {
    return newBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() { return newBuilder(this); }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code org.asl19.paskoocheh.Message}
   *
   * <pre>
   * Update messages to be sent to the user
   * </pre>
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.asl19.paskoocheh.Message)
      org.asl19.paskoocheh.MessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.asl19.paskoocheh.Paskoocheh.internal_static_org_asl19_paskoocheh_Message_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.asl19.paskoocheh.Paskoocheh.internal_static_org_asl19_paskoocheh_Message_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.asl19.paskoocheh.Message.class, org.asl19.paskoocheh.Message.Builder.class);
    }

    // Construct using org.asl19.paskoocheh.Message.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
      }
    }
    private static Builder create() {
      return new Builder();
    }

    public Builder clear() {
      super.clear();
      text_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      datePublished_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000002);
      priority_ = org.asl19.paskoocheh.PriorityLevel.HIGH;
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    public Builder clone() {
      return create().mergeFrom(buildPartial());
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.asl19.paskoocheh.Paskoocheh.internal_static_org_asl19_paskoocheh_Message_descriptor;
    }

    public org.asl19.paskoocheh.Message getDefaultInstanceForType() {
      return org.asl19.paskoocheh.Message.getDefaultInstance();
    }

    public org.asl19.paskoocheh.Message build() {
      org.asl19.paskoocheh.Message result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.asl19.paskoocheh.Message buildPartial() {
      org.asl19.paskoocheh.Message result = new org.asl19.paskoocheh.Message(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.text_ = text_;
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      result.datePublished_ = datePublished_;
      if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
        to_bitField0_ |= 0x00000004;
      }
      result.priority_ = priority_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.asl19.paskoocheh.Message) {
        return mergeFrom((org.asl19.paskoocheh.Message)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.asl19.paskoocheh.Message other) {
      if (other == org.asl19.paskoocheh.Message.getDefaultInstance()) return this;
      if (other.hasText()) {
        bitField0_ |= 0x00000001;
        text_ = other.text_;
        onChanged();
      }
      if (other.hasDatePublished()) {
        setDatePublished(other.getDatePublished());
      }
      if (other.hasPriority()) {
        setPriority(other.getPriority());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      return this;
    }

    public final boolean isInitialized() {
      if (!hasText()) {
        
        return false;
      }
      if (!hasDatePublished()) {
        
        return false;
      }
      if (!hasPriority()) {
        
        return false;
      }
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.asl19.paskoocheh.Message parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.asl19.paskoocheh.Message) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object text_ = "";
    /**
     * <code>required string text = 1;</code>
     *
     * <pre>
     * Text of the message
     * </pre>
     */
    public boolean hasText() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string text = 1;</code>
     *
     * <pre>
     * Text of the message
     * </pre>
     */
    public java.lang.String getText() {
      java.lang.Object ref = text_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          text_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>required string text = 1;</code>
     *
     * <pre>
     * Text of the message
     * </pre>
     */
    public com.google.protobuf.ByteString
        getTextBytes() {
      java.lang.Object ref = text_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        text_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>required string text = 1;</code>
     *
     * <pre>
     * Text of the message
     * </pre>
     */
    public Builder setText(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      text_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>required string text = 1;</code>
     *
     * <pre>
     * Text of the message
     * </pre>
     */
    public Builder clearText() {
      bitField0_ = (bitField0_ & ~0x00000001);
      text_ = getDefaultInstance().getText();
      onChanged();
      return this;
    }
    /**
     * <code>required string text = 1;</code>
     *
     * <pre>
     * Text of the message
     * </pre>
     */
    public Builder setTextBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      text_ = value;
      onChanged();
      return this;
    }

    private long datePublished_ ;
    /**
     * <code>required int64 date_published = 2;</code>
     *
     * <pre>
     * Date the message published
     * </pre>
     */
    public boolean hasDatePublished() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required int64 date_published = 2;</code>
     *
     * <pre>
     * Date the message published
     * </pre>
     */
    public long getDatePublished() {
      return datePublished_;
    }
    /**
     * <code>required int64 date_published = 2;</code>
     *
     * <pre>
     * Date the message published
     * </pre>
     */
    public Builder setDatePublished(long value) {
      bitField0_ |= 0x00000002;
      datePublished_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>required int64 date_published = 2;</code>
     *
     * <pre>
     * Date the message published
     * </pre>
     */
    public Builder clearDatePublished() {
      bitField0_ = (bitField0_ & ~0x00000002);
      datePublished_ = 0L;
      onChanged();
      return this;
    }

    private org.asl19.paskoocheh.PriorityLevel priority_ = org.asl19.paskoocheh.PriorityLevel.HIGH;
    /**
     * <code>required .org.asl19.paskoocheh.PriorityLevel priority = 3;</code>
     *
     * <pre>
     * Priority of the message
     * </pre>
     */
    public boolean hasPriority() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required .org.asl19.paskoocheh.PriorityLevel priority = 3;</code>
     *
     * <pre>
     * Priority of the message
     * </pre>
     */
    public org.asl19.paskoocheh.PriorityLevel getPriority() {
      return priority_;
    }
    /**
     * <code>required .org.asl19.paskoocheh.PriorityLevel priority = 3;</code>
     *
     * <pre>
     * Priority of the message
     * </pre>
     */
    public Builder setPriority(org.asl19.paskoocheh.PriorityLevel value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      priority_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>required .org.asl19.paskoocheh.PriorityLevel priority = 3;</code>
     *
     * <pre>
     * Priority of the message
     * </pre>
     */
    public Builder clearPriority() {
      bitField0_ = (bitField0_ & ~0x00000004);
      priority_ = org.asl19.paskoocheh.PriorityLevel.HIGH;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:org.asl19.paskoocheh.Message)
  }

  static {
    defaultInstance = new Message(true);
    defaultInstance.initFields();
  }

  // @@protoc_insertion_point(class_scope:org.asl19.paskoocheh.Message)
}

