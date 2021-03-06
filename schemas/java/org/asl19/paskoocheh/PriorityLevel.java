// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: paskoocheh.proto

package org.asl19.paskoocheh;

/**
 * Protobuf enum {@code org.asl19.paskoocheh.PriorityLevel}
 *
 * <pre>
 * Priority level for update messages
 * </pre>
 */
public enum PriorityLevel
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>HIGH = 0;</code>
   */
  HIGH(0, 0),
  /**
   * <code>MEDIUM = 1;</code>
   */
  MEDIUM(1, 1),
  /**
   * <code>LOW = 2;</code>
   */
  LOW(2, 2),
  ;

  /**
   * <code>HIGH = 0;</code>
   */
  public static final int HIGH_VALUE = 0;
  /**
   * <code>MEDIUM = 1;</code>
   */
  public static final int MEDIUM_VALUE = 1;
  /**
   * <code>LOW = 2;</code>
   */
  public static final int LOW_VALUE = 2;


  public final int getNumber() { return value; }

  public static PriorityLevel valueOf(int value) {
    switch (value) {
      case 0: return HIGH;
      case 1: return MEDIUM;
      case 2: return LOW;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PriorityLevel>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static com.google.protobuf.Internal.EnumLiteMap<PriorityLevel>
      internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<PriorityLevel>() {
          public PriorityLevel findValueByNumber(int number) {
            return PriorityLevel.valueOf(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(index);
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return org.asl19.paskoocheh.Paskoocheh.getDescriptor()
        .getEnumTypes().get(3);
  }

  private static final PriorityLevel[] VALUES = values();

  public static PriorityLevel valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    return VALUES[desc.getIndex()];
  }

  private final int index;
  private final int value;

  private PriorityLevel(int index, int value) {
    this.index = index;
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:org.asl19.paskoocheh.PriorityLevel)
}

