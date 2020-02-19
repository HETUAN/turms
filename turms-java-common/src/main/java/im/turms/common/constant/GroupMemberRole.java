// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: constant/group_member_role.proto

package im.turms.common.constant;

/**
 * Protobuf enum {@code im.turms.proto.GroupMemberRole}
 */
public enum GroupMemberRole
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>OWNER = 0;</code>
   */
  OWNER(0),
  /**
   * <code>MANAGER = 1;</code>
   */
  MANAGER(1),
  /**
   * <code>MEMBER = 2;</code>
   */
  MEMBER(2),
  /**
   * <code>GUEST = 3;</code>
   */
  GUEST(3),
  /**
   * <code>ANONYMOUS_GUEST = 4;</code>
   */
  ANONYMOUS_GUEST(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>OWNER = 0;</code>
   */
  public static final int OWNER_VALUE = 0;
  /**
   * <code>MANAGER = 1;</code>
   */
  public static final int MANAGER_VALUE = 1;
  /**
   * <code>MEMBER = 2;</code>
   */
  public static final int MEMBER_VALUE = 2;
  /**
   * <code>GUEST = 3;</code>
   */
  public static final int GUEST_VALUE = 3;
  /**
   * <code>ANONYMOUS_GUEST = 4;</code>
   */
  public static final int ANONYMOUS_GUEST_VALUE = 4;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static GroupMemberRole valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static GroupMemberRole forNumber(int value) {
    switch (value) {
      case 0: return OWNER;
      case 1: return MANAGER;
      case 2: return MEMBER;
      case 3: return GUEST;
      case 4: return ANONYMOUS_GUEST;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<GroupMemberRole>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      GroupMemberRole> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<GroupMemberRole>() {
          public GroupMemberRole findValueByNumber(int number) {
            return GroupMemberRole.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return im.turms.common.constant.GroupMemberRoleOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final GroupMemberRole[] VALUES = values();

  public static GroupMemberRole valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private GroupMemberRole(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:im.turms.proto.GroupMemberRole)
}

