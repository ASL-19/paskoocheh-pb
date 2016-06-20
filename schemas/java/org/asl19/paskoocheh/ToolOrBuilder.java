// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: paskoocheh.proto

package org.asl19.paskoocheh;

public interface ToolOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.asl19.paskoocheh.Tool)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>required .org.asl19.paskoocheh.Contact contact = 1;</code>
   *
   * <pre>
   * Author of the tool
   * </pre>
   */
  boolean hasContact();
  /**
   * <code>required .org.asl19.paskoocheh.Contact contact = 1;</code>
   *
   * <pre>
   * Author of the tool
   * </pre>
   */
  org.asl19.paskoocheh.Contact getContact();
  /**
   * <code>required .org.asl19.paskoocheh.Contact contact = 1;</code>
   *
   * <pre>
   * Author of the tool
   * </pre>
   */
  org.asl19.paskoocheh.ContactOrBuilder getContactOrBuilder();

  /**
   * <code>repeated .org.asl19.paskoocheh.ToolType types = 2;</code>
   *
   * <pre>
   * Different tool types for a tool
   * </pre>
   */
  java.util.List<org.asl19.paskoocheh.ToolType> getTypesList();
  /**
   * <code>repeated .org.asl19.paskoocheh.ToolType types = 2;</code>
   *
   * <pre>
   * Different tool types for a tool
   * </pre>
   */
  int getTypesCount();
  /**
   * <code>repeated .org.asl19.paskoocheh.ToolType types = 2;</code>
   *
   * <pre>
   * Different tool types for a tool
   * </pre>
   */
  org.asl19.paskoocheh.ToolType getTypes(int index);

  /**
   * <code>repeated string tags = 3;</code>
   *
   * <pre>
   * Different tag for the tool
   * </pre>
   */
  com.google.protobuf.ProtocolStringList
      getTagsList();
  /**
   * <code>repeated string tags = 3;</code>
   *
   * <pre>
   * Different tag for the tool
   * </pre>
   */
  int getTagsCount();
  /**
   * <code>repeated string tags = 3;</code>
   *
   * <pre>
   * Different tag for the tool
   * </pre>
   */
  java.lang.String getTags(int index);
  /**
   * <code>repeated string tags = 3;</code>
   *
   * <pre>
   * Different tag for the tool
   * </pre>
   */
  com.google.protobuf.ByteString
      getTagsBytes(int index);

  /**
   * <code>required bool is_opensource = 4;</code>
   *
   * <pre>
   * Is tool open source?
   * </pre>
   */
  boolean hasIsOpensource();
  /**
   * <code>required bool is_opensource = 4;</code>
   *
   * <pre>
   * Is tool open source?
   * </pre>
   */
  boolean getIsOpensource();

  /**
   * <code>required bool is_recommended = 5;</code>
   *
   * <pre>
   * Is tool recommended by ASL19
   * </pre>
   */
  boolean hasIsRecommended();
  /**
   * <code>required bool is_recommended = 5;</code>
   *
   * <pre>
   * Is tool recommended by ASL19
   * </pre>
   */
  boolean getIsRecommended();

  /**
   * <code>required bool is_featured = 6;</code>
   *
   * <pre>
   * Is tool featured on the app?
   * </pre>
   */
  boolean hasIsFeatured();
  /**
   * <code>required bool is_featured = 6;</code>
   *
   * <pre>
   * Is tool featured on the app?
   * </pre>
   */
  boolean getIsFeatured();

  /**
   * <code>repeated .org.asl19.paskoocheh.Faq faqs = 8;</code>
   *
   * <pre>
   * Multiple FAQ related to this tool
   * </pre>
   */
  java.util.List<org.asl19.paskoocheh.Faq> 
      getFaqsList();
  /**
   * <code>repeated .org.asl19.paskoocheh.Faq faqs = 8;</code>
   *
   * <pre>
   * Multiple FAQ related to this tool
   * </pre>
   */
  org.asl19.paskoocheh.Faq getFaqs(int index);
  /**
   * <code>repeated .org.asl19.paskoocheh.Faq faqs = 8;</code>
   *
   * <pre>
   * Multiple FAQ related to this tool
   * </pre>
   */
  int getFaqsCount();
  /**
   * <code>repeated .org.asl19.paskoocheh.Faq faqs = 8;</code>
   *
   * <pre>
   * Multiple FAQ related to this tool
   * </pre>
   */
  java.util.List<? extends org.asl19.paskoocheh.FaqOrBuilder> 
      getFaqsOrBuilderList();
  /**
   * <code>repeated .org.asl19.paskoocheh.Faq faqs = 8;</code>
   *
   * <pre>
   * Multiple FAQ related to this tool
   * </pre>
   */
  org.asl19.paskoocheh.FaqOrBuilder getFaqsOrBuilder(
      int index);

  /**
   * <code>required .org.asl19.paskoocheh.Contact vendor = 9;</code>
   *
   * <pre>
   * Vendor of the tool
   * </pre>
   */
  boolean hasVendor();
  /**
   * <code>required .org.asl19.paskoocheh.Contact vendor = 9;</code>
   *
   * <pre>
   * Vendor of the tool
   * </pre>
   */
  org.asl19.paskoocheh.Contact getVendor();
  /**
   * <code>required .org.asl19.paskoocheh.Contact vendor = 9;</code>
   *
   * <pre>
   * Vendor of the tool
   * </pre>
   */
  org.asl19.paskoocheh.ContactOrBuilder getVendorOrBuilder();

  /**
   * <code>repeated .org.asl19.paskoocheh.Release releases = 10;</code>
   *
   * <pre>
   * Release/Version information for the tool
   * </pre>
   */
  java.util.List<org.asl19.paskoocheh.Release> 
      getReleasesList();
  /**
   * <code>repeated .org.asl19.paskoocheh.Release releases = 10;</code>
   *
   * <pre>
   * Release/Version information for the tool
   * </pre>
   */
  org.asl19.paskoocheh.Release getReleases(int index);
  /**
   * <code>repeated .org.asl19.paskoocheh.Release releases = 10;</code>
   *
   * <pre>
   * Release/Version information for the tool
   * </pre>
   */
  int getReleasesCount();
  /**
   * <code>repeated .org.asl19.paskoocheh.Release releases = 10;</code>
   *
   * <pre>
   * Release/Version information for the tool
   * </pre>
   */
  java.util.List<? extends org.asl19.paskoocheh.ReleaseOrBuilder> 
      getReleasesOrBuilderList();
  /**
   * <code>repeated .org.asl19.paskoocheh.Release releases = 10;</code>
   *
   * <pre>
   * Release/Version information for the tool
   * </pre>
   */
  org.asl19.paskoocheh.ReleaseOrBuilder getReleasesOrBuilder(
      int index);

  /**
   * <code>repeated .org.asl19.paskoocheh.Message update = 20;</code>
   *
   * <pre>
   * Tool specific updated for the user
   * </pre>
   */
  java.util.List<org.asl19.paskoocheh.Message> 
      getUpdateList();
  /**
   * <code>repeated .org.asl19.paskoocheh.Message update = 20;</code>
   *
   * <pre>
   * Tool specific updated for the user
   * </pre>
   */
  org.asl19.paskoocheh.Message getUpdate(int index);
  /**
   * <code>repeated .org.asl19.paskoocheh.Message update = 20;</code>
   *
   * <pre>
   * Tool specific updated for the user
   * </pre>
   */
  int getUpdateCount();
  /**
   * <code>repeated .org.asl19.paskoocheh.Message update = 20;</code>
   *
   * <pre>
   * Tool specific updated for the user
   * </pre>
   */
  java.util.List<? extends org.asl19.paskoocheh.MessageOrBuilder> 
      getUpdateOrBuilderList();
  /**
   * <code>repeated .org.asl19.paskoocheh.Message update = 20;</code>
   *
   * <pre>
   * Tool specific updated for the user
   * </pre>
   */
  org.asl19.paskoocheh.MessageOrBuilder getUpdateOrBuilder(
      int index);
}