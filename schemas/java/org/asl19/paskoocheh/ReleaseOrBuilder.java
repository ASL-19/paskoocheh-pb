// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: paskoocheh.proto

package org.asl19.paskoocheh;

public interface ReleaseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.asl19.paskoocheh.Release)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>required string version = 1;</code>
   *
   * <pre>
   * Version of the release
   * </pre>
   */
  boolean hasVersion();
  /**
   * <code>required string version = 1;</code>
   *
   * <pre>
   * Version of the release
   * </pre>
   */
  java.lang.String getVersion();
  /**
   * <code>required string version = 1;</code>
   *
   * <pre>
   * Version of the release
   * </pre>
   */
  com.google.protobuf.ByteString
      getVersionBytes();

  /**
   * <code>required int64 date_created = 2;</code>
   *
   * <pre>
   * Date the file uploaded in unix time
   * </pre>
   */
  boolean hasDateCreated();
  /**
   * <code>required int64 date_created = 2;</code>
   *
   * <pre>
   * Date the file uploaded in unix time
   * </pre>
   */
  long getDateCreated();

  /**
   * <code>required .org.asl19.paskoocheh.BinaryFile binary = 3;</code>
   */
  boolean hasBinary();
  /**
   * <code>required .org.asl19.paskoocheh.BinaryFile binary = 3;</code>
   */
  org.asl19.paskoocheh.BinaryFile getBinary();
  /**
   * <code>required .org.asl19.paskoocheh.BinaryFile binary = 3;</code>
   */
  org.asl19.paskoocheh.BinaryFileOrBuilder getBinaryOrBuilder();

  /**
   * <code>optional float rating = 4;</code>
   *
   * <pre>
   * Rating for this release
   * </pre>
   */
  boolean hasRating();
  /**
   * <code>optional float rating = 4;</code>
   *
   * <pre>
   * Rating for this release
   * </pre>
   */
  float getRating();

  /**
   * <code>optional int64 download_count = 5;</code>
   *
   * <pre>
   * Number of times this release is downloaded
   * </pre>
   */
  boolean hasDownloadCount();
  /**
   * <code>optional int64 download_count = 5;</code>
   *
   * <pre>
   * Number of times this release is downloaded
   * </pre>
   */
  long getDownloadCount();

  /**
   * <code>optional string icon = 6;</code>
   *
   * <pre>
   * URL for the release icon
   * </pre>
   */
  boolean hasIcon();
  /**
   * <code>optional string icon = 6;</code>
   *
   * <pre>
   * URL for the release icon
   * </pre>
   */
  java.lang.String getIcon();
  /**
   * <code>optional string icon = 6;</code>
   *
   * <pre>
   * URL for the release icon
   * </pre>
   */
  com.google.protobuf.ByteString
      getIconBytes();

  /**
   * <code>optional int64 date_modified = 7;</code>
   *
   * <pre>
   * Last time this release is modified in unix time
   * </pre>
   */
  boolean hasDateModified();
  /**
   * <code>optional int64 date_modified = 7;</code>
   *
   * <pre>
   * Last time this release is modified in unix time
   * </pre>
   */
  long getDateModified();

  /**
   * <code>required int64 date_released = 8;</code>
   *
   * <pre>
   * The date this version is released in unix time
   * </pre>
   */
  boolean hasDateReleased();
  /**
   * <code>required int64 date_released = 8;</code>
   *
   * <pre>
   * The date this version is released in unix time
   * </pre>
   */
  long getDateReleased();

  /**
   * <code>required string release_url = 9;</code>
   *
   * <pre>
   * The original URL for the release
   * </pre>
   */
  boolean hasReleaseUrl();
  /**
   * <code>required string release_url = 9;</code>
   *
   * <pre>
   * The original URL for the release
   * </pre>
   */
  java.lang.String getReleaseUrl();
  /**
   * <code>required string release_url = 9;</code>
   *
   * <pre>
   * The original URL for the release
   * </pre>
   */
  com.google.protobuf.ByteString
      getReleaseUrlBytes();

  /**
   * <code>repeated string screenshots = 10;</code>
   *
   * <pre>
   * Screen Shots for this release
   * </pre>
   */
  com.google.protobuf.ProtocolStringList
      getScreenshotsList();
  /**
   * <code>repeated string screenshots = 10;</code>
   *
   * <pre>
   * Screen Shots for this release
   * </pre>
   */
  int getScreenshotsCount();
  /**
   * <code>repeated string screenshots = 10;</code>
   *
   * <pre>
   * Screen Shots for this release
   * </pre>
   */
  java.lang.String getScreenshots(int index);
  /**
   * <code>repeated string screenshots = 10;</code>
   *
   * <pre>
   * Screen Shots for this release
   * </pre>
   */
  com.google.protobuf.ByteString
      getScreenshotsBytes(int index);

  /**
   * <code>repeated string tutorials = 11;</code>
   *
   * <pre>
   * Video Tutorials for this release
   * </pre>
   */
  com.google.protobuf.ProtocolStringList
      getTutorialsList();
  /**
   * <code>repeated string tutorials = 11;</code>
   *
   * <pre>
   * Video Tutorials for this release
   * </pre>
   */
  int getTutorialsCount();
  /**
   * <code>repeated string tutorials = 11;</code>
   *
   * <pre>
   * Video Tutorials for this release
   * </pre>
   */
  java.lang.String getTutorials(int index);
  /**
   * <code>repeated string tutorials = 11;</code>
   *
   * <pre>
   * Video Tutorials for this release
   * </pre>
   */
  com.google.protobuf.ByteString
      getTutorialsBytes(int index);

  /**
   * <code>optional string package_name = 12;</code>
   *
   * <pre>
   * Android package name - android specific
   * </pre>
   */
  boolean hasPackageName();
  /**
   * <code>optional string package_name = 12;</code>
   *
   * <pre>
   * Android package name - android specific
   * </pre>
   */
  java.lang.String getPackageName();
  /**
   * <code>optional string package_name = 12;</code>
   *
   * <pre>
   * Android package name - android specific
   * </pre>
   */
  com.google.protobuf.ByteString
      getPackageNameBytes();

  /**
   * <code>optional int32 build_version = 13;</code>
   *
   * <pre>
   * Android build version - android specific
   * </pre>
   */
  boolean hasBuildVersion();
  /**
   * <code>optional int32 build_version = 13;</code>
   *
   * <pre>
   * Android build version - android specific
   * </pre>
   */
  int getBuildVersion();

  /**
   * <code>repeated .org.asl19.paskoocheh.Message update = 20;</code>
   *
   * <pre>
   * Release specific updates for the user
   * </pre>
   */
  java.util.List<org.asl19.paskoocheh.Message> 
      getUpdateList();
  /**
   * <code>repeated .org.asl19.paskoocheh.Message update = 20;</code>
   *
   * <pre>
   * Release specific updates for the user
   * </pre>
   */
  org.asl19.paskoocheh.Message getUpdate(int index);
  /**
   * <code>repeated .org.asl19.paskoocheh.Message update = 20;</code>
   *
   * <pre>
   * Release specific updates for the user
   * </pre>
   */
  int getUpdateCount();
  /**
   * <code>repeated .org.asl19.paskoocheh.Message update = 20;</code>
   *
   * <pre>
   * Release specific updates for the user
   * </pre>
   */
  java.util.List<? extends org.asl19.paskoocheh.MessageOrBuilder> 
      getUpdateOrBuilderList();
  /**
   * <code>repeated .org.asl19.paskoocheh.Message update = 20;</code>
   *
   * <pre>
   * Release specific updates for the user
   * </pre>
   */
  org.asl19.paskoocheh.MessageOrBuilder getUpdateOrBuilder(
      int index);
}
