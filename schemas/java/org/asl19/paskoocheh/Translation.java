// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: paskoocheh.proto

package org.asl19.paskoocheh;

/**
 * Protobuf type {@code org.asl19.paskoocheh.Translation}
 *
 * <pre>
 * Fields that can have translations in different languages
 * </pre>
 */
public final class Translation extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:org.asl19.paskoocheh.Translation)
    TranslationOrBuilder {
  // Use Translation.newBuilder() to construct.
  private Translation(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
    this.unknownFields = builder.getUnknownFields();
  }
  private Translation(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

  private static final Translation defaultInstance;
  public static Translation getDefaultInstance() {
    return defaultInstance;
  }

  public Translation getDefaultInstanceForType() {
    return defaultInstance;
  }

  private final com.google.protobuf.UnknownFieldSet unknownFields;
  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
    return this.unknownFields;
  }
  private Translation(
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
            lang_ = bs;
            break;
          }
          case 18: {
            com.google.protobuf.ByteString bs = input.readBytes();
            bitField0_ |= 0x00000002;
            name_ = bs;
            break;
          }
          case 26: {
            com.google.protobuf.ByteString bs = input.readBytes();
            bitField0_ |= 0x00000004;
            description_ = bs;
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
    return org.asl19.paskoocheh.Paskoocheh.internal_static_org_asl19_paskoocheh_Translation_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.asl19.paskoocheh.Paskoocheh.internal_static_org_asl19_paskoocheh_Translation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.asl19.paskoocheh.Translation.class, org.asl19.paskoocheh.Translation.Builder.class);
  }

  public static com.google.protobuf.Parser<Translation> PARSER =
      new com.google.protobuf.AbstractParser<Translation>() {
    public Translation parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Translation(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public com.google.protobuf.Parser<Translation> getParserForType() {
    return PARSER;
  }

  private int bitField0_;
  public static final int LANG_FIELD_NUMBER = 1;
  private java.lang.Object lang_;
  /**
   * <code>required string lang = 1;</code>
   *
   * <pre>
   * Language of the translation
   * </pre>
   */
  public boolean hasLang() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>required string lang = 1;</code>
   *
   * <pre>
   * Language of the translation
   * </pre>
   */
  public java.lang.String getLang() {
    java.lang.Object ref = lang_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        lang_ = s;
      }
      return s;
    }
  }
  /**
   * <code>required string lang = 1;</code>
   *
   * <pre>
   * Language of the translation
   * </pre>
   */
  public com.google.protobuf.ByteString
      getLangBytes() {
    java.lang.Object ref = lang_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      lang_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NAME_FIELD_NUMBER = 2;
  private java.lang.Object name_;
  /**
   * <code>required string name = 2;</code>
   *
   * <pre>
   * Name if the tool in the lang
   * </pre>
   */
  public boolean hasName() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>required string name = 2;</code>
   *
   * <pre>
   * Name if the tool in the lang
   * </pre>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        name_ = s;
      }
      return s;
    }
  }
  /**
   * <code>required string name = 2;</code>
   *
   * <pre>
   * Name if the tool in the lang
   * </pre>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 3;
  private java.lang.Object description_;
  /**
   * <code>optional string description = 3;</code>
   *
   * <pre>
   * Description for the tool in the lang
   * </pre>
   */
  public boolean hasDescription() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>optional string description = 3;</code>
   *
   * <pre>
   * Description for the tool in the lang
   * </pre>
   */
  public java.lang.String getDescription() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        description_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string description = 3;</code>
   *
   * <pre>
   * Description for the tool in the lang
   * </pre>
   */
  public com.google.protobuf.ByteString
      getDescriptionBytes() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      description_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private void initFields() {
    lang_ = "";
    name_ = "";
    description_ = "";
  }
  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    if (!hasLang()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!hasName()) {
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
      output.writeBytes(1, getLangBytes());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeBytes(2, getNameBytes());
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeBytes(3, getDescriptionBytes());
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
        .computeBytesSize(1, getLangBytes());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, getNameBytes());
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, getDescriptionBytes());
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
    if (!(obj instanceof org.asl19.paskoocheh.Translation)) {
      return super.equals(obj);
    }
    org.asl19.paskoocheh.Translation other = (org.asl19.paskoocheh.Translation) obj;

    boolean result = true;
    result = result && (hasLang() == other.hasLang());
    if (hasLang()) {
      result = result && getLang()
          .equals(other.getLang());
    }
    result = result && (hasName() == other.hasName());
    if (hasName()) {
      result = result && getName()
          .equals(other.getName());
    }
    result = result && (hasDescription() == other.hasDescription());
    if (hasDescription()) {
      result = result && getDescription()
          .equals(other.getDescription());
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
    if (hasLang()) {
      hash = (37 * hash) + LANG_FIELD_NUMBER;
      hash = (53 * hash) + getLang().hashCode();
    }
    if (hasName()) {
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
    }
    if (hasDescription()) {
      hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
      hash = (53 * hash) + getDescription().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.asl19.paskoocheh.Translation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.asl19.paskoocheh.Translation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.asl19.paskoocheh.Translation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.asl19.paskoocheh.Translation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.asl19.paskoocheh.Translation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static org.asl19.paskoocheh.Translation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static org.asl19.paskoocheh.Translation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static org.asl19.paskoocheh.Translation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static org.asl19.paskoocheh.Translation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static org.asl19.paskoocheh.Translation parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(org.asl19.paskoocheh.Translation prototype) {
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
   * Protobuf type {@code org.asl19.paskoocheh.Translation}
   *
   * <pre>
   * Fields that can have translations in different languages
   * </pre>
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.asl19.paskoocheh.Translation)
      org.asl19.paskoocheh.TranslationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.asl19.paskoocheh.Paskoocheh.internal_static_org_asl19_paskoocheh_Translation_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.asl19.paskoocheh.Paskoocheh.internal_static_org_asl19_paskoocheh_Translation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.asl19.paskoocheh.Translation.class, org.asl19.paskoocheh.Translation.Builder.class);
    }

    // Construct using org.asl19.paskoocheh.Translation.newBuilder()
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
      lang_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      name_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      description_ = "";
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    public Builder clone() {
      return create().mergeFrom(buildPartial());
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.asl19.paskoocheh.Paskoocheh.internal_static_org_asl19_paskoocheh_Translation_descriptor;
    }

    public org.asl19.paskoocheh.Translation getDefaultInstanceForType() {
      return org.asl19.paskoocheh.Translation.getDefaultInstance();
    }

    public org.asl19.paskoocheh.Translation build() {
      org.asl19.paskoocheh.Translation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.asl19.paskoocheh.Translation buildPartial() {
      org.asl19.paskoocheh.Translation result = new org.asl19.paskoocheh.Translation(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.lang_ = lang_;
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      result.name_ = name_;
      if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
        to_bitField0_ |= 0x00000004;
      }
      result.description_ = description_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.asl19.paskoocheh.Translation) {
        return mergeFrom((org.asl19.paskoocheh.Translation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.asl19.paskoocheh.Translation other) {
      if (other == org.asl19.paskoocheh.Translation.getDefaultInstance()) return this;
      if (other.hasLang()) {
        bitField0_ |= 0x00000001;
        lang_ = other.lang_;
        onChanged();
      }
      if (other.hasName()) {
        bitField0_ |= 0x00000002;
        name_ = other.name_;
        onChanged();
      }
      if (other.hasDescription()) {
        bitField0_ |= 0x00000004;
        description_ = other.description_;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
      return this;
    }

    public final boolean isInitialized() {
      if (!hasLang()) {
        
        return false;
      }
      if (!hasName()) {
        
        return false;
      }
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.asl19.paskoocheh.Translation parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.asl19.paskoocheh.Translation) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object lang_ = "";
    /**
     * <code>required string lang = 1;</code>
     *
     * <pre>
     * Language of the translation
     * </pre>
     */
    public boolean hasLang() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string lang = 1;</code>
     *
     * <pre>
     * Language of the translation
     * </pre>
     */
    public java.lang.String getLang() {
      java.lang.Object ref = lang_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          lang_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>required string lang = 1;</code>
     *
     * <pre>
     * Language of the translation
     * </pre>
     */
    public com.google.protobuf.ByteString
        getLangBytes() {
      java.lang.Object ref = lang_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        lang_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>required string lang = 1;</code>
     *
     * <pre>
     * Language of the translation
     * </pre>
     */
    public Builder setLang(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      lang_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>required string lang = 1;</code>
     *
     * <pre>
     * Language of the translation
     * </pre>
     */
    public Builder clearLang() {
      bitField0_ = (bitField0_ & ~0x00000001);
      lang_ = getDefaultInstance().getLang();
      onChanged();
      return this;
    }
    /**
     * <code>required string lang = 1;</code>
     *
     * <pre>
     * Language of the translation
     * </pre>
     */
    public Builder setLangBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      lang_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>required string name = 2;</code>
     *
     * <pre>
     * Name if the tool in the lang
     * </pre>
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required string name = 2;</code>
     *
     * <pre>
     * Name if the tool in the lang
     * </pre>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          name_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>required string name = 2;</code>
     *
     * <pre>
     * Name if the tool in the lang
     * </pre>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>required string name = 2;</code>
     *
     * <pre>
     * Name if the tool in the lang
     * </pre>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>required string name = 2;</code>
     *
     * <pre>
     * Name if the tool in the lang
     * </pre>
     */
    public Builder clearName() {
      bitField0_ = (bitField0_ & ~0x00000002);
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>required string name = 2;</code>
     *
     * <pre>
     * Name if the tool in the lang
     * </pre>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      name_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object description_ = "";
    /**
     * <code>optional string description = 3;</code>
     *
     * <pre>
     * Description for the tool in the lang
     * </pre>
     */
    public boolean hasDescription() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional string description = 3;</code>
     *
     * <pre>
     * Description for the tool in the lang
     * </pre>
     */
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          description_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string description = 3;</code>
     *
     * <pre>
     * Description for the tool in the lang
     * </pre>
     */
    public com.google.protobuf.ByteString
        getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string description = 3;</code>
     *
     * <pre>
     * Description for the tool in the lang
     * </pre>
     */
    public Builder setDescription(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
      description_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string description = 3;</code>
     *
     * <pre>
     * Description for the tool in the lang
     * </pre>
     */
    public Builder clearDescription() {
      bitField0_ = (bitField0_ & ~0x00000004);
      description_ = getDefaultInstance().getDescription();
      onChanged();
      return this;
    }
    /**
     * <code>optional string description = 3;</code>
     *
     * <pre>
     * Description for the tool in the lang
     * </pre>
     */
    public Builder setDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
      description_ = value;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:org.asl19.paskoocheh.Translation)
  }

  static {
    defaultInstance = new Translation(true);
    defaultInstance.initFields();
  }

  // @@protoc_insertion_point(class_scope:org.asl19.paskoocheh.Translation)
}
