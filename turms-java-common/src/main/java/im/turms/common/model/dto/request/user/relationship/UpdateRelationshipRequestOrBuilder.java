// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: request/user/relationship/update_relationship_request.proto

package im.turms.common.model.dto.request.user.relationship;

public interface UpdateRelationshipRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:im.turms.proto.UpdateRelationshipRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 related_user_id = 1;</code>
   * @return The relatedUserId.
   */
  long getRelatedUserId();

  /**
   * <code>.google.protobuf.BoolValue blocked = 2;</code>
   * @return Whether the blocked field is set.
   */
  boolean hasBlocked();
  /**
   * <code>.google.protobuf.BoolValue blocked = 2;</code>
   * @return The blocked.
   */
  com.google.protobuf.BoolValue getBlocked();
  /**
   * <code>.google.protobuf.BoolValue blocked = 2;</code>
   */
  com.google.protobuf.BoolValueOrBuilder getBlockedOrBuilder();

  /**
   * <code>.google.protobuf.Int32Value new_group_index = 3;</code>
   * @return Whether the newGroupIndex field is set.
   */
  boolean hasNewGroupIndex();
  /**
   * <code>.google.protobuf.Int32Value new_group_index = 3;</code>
   * @return The newGroupIndex.
   */
  com.google.protobuf.Int32Value getNewGroupIndex();
  /**
   * <code>.google.protobuf.Int32Value new_group_index = 3;</code>
   */
  com.google.protobuf.Int32ValueOrBuilder getNewGroupIndexOrBuilder();

  /**
   * <code>.google.protobuf.Int32Value delete_group_index = 4;</code>
   * @return Whether the deleteGroupIndex field is set.
   */
  boolean hasDeleteGroupIndex();
  /**
   * <code>.google.protobuf.Int32Value delete_group_index = 4;</code>
   * @return The deleteGroupIndex.
   */
  com.google.protobuf.Int32Value getDeleteGroupIndex();
  /**
   * <code>.google.protobuf.Int32Value delete_group_index = 4;</code>
   */
  com.google.protobuf.Int32ValueOrBuilder getDeleteGroupIndexOrBuilder();
}
