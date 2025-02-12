/*
 * Copyright (C) 2019 The Turms Project
 * https://github.com/turms-im/turms
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: notification/turms_notification.proto

package im.turms.common.model.dto.notification;

public final class TurmsNotificationOuterClass {
  private TurmsNotificationOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_im_turms_proto_TurmsNotification_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_im_turms_proto_TurmsNotification_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_im_turms_proto_TurmsNotification_Data_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_im_turms_proto_TurmsNotification_Data_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%notification/turms_notification.proto\022" +
      "\016im.turms.proto\032\033request/turms_request.p" +
      "roto\032\037model/common/int64_values.proto\032,m" +
      "odel/common/int64_values_with_version.pr" +
      "oto\0320model/group/group_invitations_with_" +
      "version.proto\0324model/group/group_join_qu" +
      "estions_answer_result.proto\0323model/group" +
      "/group_join_questions_with_version.proto" +
      "\0322model/group/group_join_requests_with_v" +
      "ersion.proto\032,model/group/group_members_" +
      "with_version.proto\032%model/group/groups_w" +
      "ith_version.proto\032&model/conversation/co" +
      "nversations.proto\032\034model/message/message" +
      "s.proto\032,model/message/messages_with_tot" +
      "al_list.proto\032\035model/user/nearby_users.p" +
      "roto\0322model/user/user_friend_requests_wi" +
      "th_version.proto\0326model/user/user_relati" +
      "onship_groups_with_version.proto\0320model/" +
      "user/user_relationships_with_version.pro" +
      "to\032\035model/user/user_session.proto\032)model" +
      "/user/users_infos_with_version.proto\032&mo" +
      "del/user/users_online_statuses.proto\"\214\r\n" +
      "\021TurmsNotification\022\027\n\nrequest_id\030\001 \001(\003H\000" +
      "\210\001\001\022\021\n\004code\030\002 \001(\005H\001\210\001\001\022\023\n\006reason\030\003 \001(\tH\002" +
      "\210\001\001\0224\n\004data\030\004 \001(\0132&.im.turms.proto.Turms" +
      "Notification.Data\022\031\n\014requester_id\030\005 \001(\003H" +
      "\003\210\001\001\022\031\n\014close_status\030\006 \001(\005H\004\210\001\001\0225\n\017relay" +
      "ed_request\030\007 \001(\0132\034.im.turms.proto.TurmsR" +
      "equest\032\315\n\n\004Data\022*\n\003ids\030\001 \001(\0132\033.im.turms." +
      "proto.Int64ValuesH\000\022B\n\020ids_with_version\030" +
      "\002 \001(\0132&.im.turms.proto.Int64ValuesWithVe" +
      "rsionH\000\022\r\n\003url\030\003 \001(\tH\000\0226\n\rconversations\030" +
      "\004 \001(\0132\035.im.turms.proto.ConversationsH\000\022," +
      "\n\010messages\030\005 \001(\0132\030.im.turms.proto.Messag" +
      "esH\000\022I\n\030messages_with_total_list\030\006 \001(\0132%" +
      ".im.turms.proto.MessagesWithTotalListH\000\022" +
      "3\n\014user_session\030\007 \001(\0132\033.im.turms.proto.U" +
      "serSessionH\000\022I\n\030users_infos_with_version" +
      "\030\010 \001(\0132%.im.turms.proto.UsersInfosWithVe" +
      "rsionH\000\022D\n\025users_online_statuses\030\t \001(\0132#" +
      ".im.turms.proto.UsersOnlineStatusesH\000\022Z\n" +
      "!user_friend_requests_with_version\030\n \001(\013" +
      "2-.im.turms.proto.UserFriendRequestsWith" +
      "VersionH\000\022b\n%user_relationship_groups_wi" +
      "th_version\030\013 \001(\01321.im.turms.proto.UserRe" +
      "lationshipGroupsWithVersionH\000\022W\n\037user_re" +
      "lationships_with_version\030\014 \001(\0132,.im.turm" +
      "s.proto.UserRelationshipsWithVersionH\000\0223" +
      "\n\014nearby_users\030\r \001(\0132\033.im.turms.proto.Ne" +
      "arbyUsersH\000\022U\n\036group_invitations_with_ve" +
      "rsion\030\016 \001(\0132+.im.turms.proto.GroupInvita" +
      "tionsWithVersionH\000\022[\n!group_join_questio" +
      "n_answer_result\030\017 \001(\0132..im.turms.proto.G" +
      "roupJoinQuestionsAnswerResultH\000\022X\n group" +
      "_join_requests_with_version\030\020 \001(\0132,.im.t" +
      "urms.proto.GroupJoinRequestsWithVersionH" +
      "\000\022Z\n!group_join_questions_with_version\030\021" +
      " \001(\0132-.im.turms.proto.GroupJoinQuestions" +
      "WithVersionH\000\022M\n\032group_members_with_vers" +
      "ion\030\022 \001(\0132\'.im.turms.proto.GroupMembersW" +
      "ithVersionH\000\022@\n\023groups_with_version\030\023 \001(" +
      "\0132!.im.turms.proto.GroupsWithVersionH\000B\006" +
      "\n\004kindB\r\n\013_request_idB\007\n\005_codeB\t\n\007_reaso" +
      "nB\017\n\r_requester_idB\017\n\r_close_statusB-\n&i" +
      "m.turms.common.model.dto.notificationP\001\272" +
      "\002\000b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          im.turms.common.model.dto.request.TurmsRequestOuterClass.getDescriptor(),
          im.turms.common.model.bo.common.Int64ValuesOuterClass.getDescriptor(),
          im.turms.common.model.bo.common.Int64ValuesWithVersionOuterClass.getDescriptor(),
          im.turms.common.model.bo.group.GroupInvitationsWithVersionOuterClass.getDescriptor(),
          im.turms.common.model.bo.group.GroupJoinQuestionsAnswerResultOuterClass.getDescriptor(),
          im.turms.common.model.bo.group.GroupJoinQuestionsWithVersionOuterClass.getDescriptor(),
          im.turms.common.model.bo.group.GroupJoinRequestsWithVersionOuterClass.getDescriptor(),
          im.turms.common.model.bo.group.GroupMembersWithVersionOuterClass.getDescriptor(),
          im.turms.common.model.bo.group.GroupsWithVersionOuterClass.getDescriptor(),
          im.turms.common.model.bo.conversation.ConversationsOuterClass.getDescriptor(),
          im.turms.common.model.bo.message.MessagesOuterClass.getDescriptor(),
          im.turms.common.model.bo.message.MessagesWithTotalListOuterClass.getDescriptor(),
          im.turms.common.model.bo.user.NearbyUsersOuterClass.getDescriptor(),
          im.turms.common.model.bo.user.UserFriendRequestsWithVersionOuterClass.getDescriptor(),
          im.turms.common.model.bo.user.UserRelationshipGroupsWithVersionOuterClass.getDescriptor(),
          im.turms.common.model.bo.user.UserRelationshipsWithVersionOuterClass.getDescriptor(),
          im.turms.common.model.bo.user.UserSessionOuterClass.getDescriptor(),
          im.turms.common.model.bo.user.UsersInfosWithVersionOuterClass.getDescriptor(),
          im.turms.common.model.bo.user.UsersOnlineStatusesOuterClass.getDescriptor(),
        });
    internal_static_im_turms_proto_TurmsNotification_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_im_turms_proto_TurmsNotification_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_im_turms_proto_TurmsNotification_descriptor,
        new java.lang.String[] { "RequestId", "Code", "Reason", "Data", "RequesterId", "CloseStatus", "RelayedRequest", "RequestId", "Code", "Reason", "RequesterId", "CloseStatus", });
    internal_static_im_turms_proto_TurmsNotification_Data_descriptor =
      internal_static_im_turms_proto_TurmsNotification_descriptor.getNestedTypes().get(0);
    internal_static_im_turms_proto_TurmsNotification_Data_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_im_turms_proto_TurmsNotification_Data_descriptor,
        new java.lang.String[] { "Ids", "IdsWithVersion", "Url", "Conversations", "Messages", "MessagesWithTotalList", "UserSession", "UsersInfosWithVersion", "UsersOnlineStatuses", "UserFriendRequestsWithVersion", "UserRelationshipGroupsWithVersion", "UserRelationshipsWithVersion", "NearbyUsers", "GroupInvitationsWithVersion", "GroupJoinQuestionAnswerResult", "GroupJoinRequestsWithVersion", "GroupJoinQuestionsWithVersion", "GroupMembersWithVersion", "GroupsWithVersion", "Kind", });
    im.turms.common.model.dto.request.TurmsRequestOuterClass.getDescriptor();
    im.turms.common.model.bo.common.Int64ValuesOuterClass.getDescriptor();
    im.turms.common.model.bo.common.Int64ValuesWithVersionOuterClass.getDescriptor();
    im.turms.common.model.bo.group.GroupInvitationsWithVersionOuterClass.getDescriptor();
    im.turms.common.model.bo.group.GroupJoinQuestionsAnswerResultOuterClass.getDescriptor();
    im.turms.common.model.bo.group.GroupJoinQuestionsWithVersionOuterClass.getDescriptor();
    im.turms.common.model.bo.group.GroupJoinRequestsWithVersionOuterClass.getDescriptor();
    im.turms.common.model.bo.group.GroupMembersWithVersionOuterClass.getDescriptor();
    im.turms.common.model.bo.group.GroupsWithVersionOuterClass.getDescriptor();
    im.turms.common.model.bo.conversation.ConversationsOuterClass.getDescriptor();
    im.turms.common.model.bo.message.MessagesOuterClass.getDescriptor();
    im.turms.common.model.bo.message.MessagesWithTotalListOuterClass.getDescriptor();
    im.turms.common.model.bo.user.NearbyUsersOuterClass.getDescriptor();
    im.turms.common.model.bo.user.UserFriendRequestsWithVersionOuterClass.getDescriptor();
    im.turms.common.model.bo.user.UserRelationshipGroupsWithVersionOuterClass.getDescriptor();
    im.turms.common.model.bo.user.UserRelationshipsWithVersionOuterClass.getDescriptor();
    im.turms.common.model.bo.user.UserSessionOuterClass.getDescriptor();
    im.turms.common.model.bo.user.UsersInfosWithVersionOuterClass.getDescriptor();
    im.turms.common.model.bo.user.UsersOnlineStatusesOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
