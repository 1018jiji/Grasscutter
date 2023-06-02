// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IrodoriChessMapData.proto

package emu.grasscutter.net.proto;

public final class IrodoriChessMapDataOuterClass {
  private IrodoriChessMapDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface IrodoriChessMapDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:IrodoriChessMapData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 map_id = 11;</code>
     * @return The mapId.
     */
    int getMapId();

    /**
     * <code>.IrodoriChessEntranceDetailInfo entrance_detail_info = 7;</code>
     * @return Whether the entranceDetailInfo field is set.
     */
    boolean hasEntranceDetailInfo();
    /**
     * <code>.IrodoriChessEntranceDetailInfo entrance_detail_info = 7;</code>
     * @return The entranceDetailInfo.
     */
    emu.grasscutter.net.proto.IrodoriChessEntranceDetailInfoOuterClass.IrodoriChessEntranceDetailInfo getEntranceDetailInfo();
    /**
     * <code>.IrodoriChessEntranceDetailInfo entrance_detail_info = 7;</code>
     */
    emu.grasscutter.net.proto.IrodoriChessEntranceDetailInfoOuterClass.IrodoriChessEntranceDetailInfoOrBuilder getEntranceDetailInfoOrBuilder();

    /**
     * <code>repeated uint32 equiped_card_list = 5;</code>
     * @return A list containing the equipedCardList.
     */
    java.util.List<java.lang.Integer> getEquipedCardListList();
    /**
     * <code>repeated uint32 equiped_card_list = 5;</code>
     * @return The count of equipedCardList.
     */
    int getEquipedCardListCount();
    /**
     * <code>repeated uint32 equiped_card_list = 5;</code>
     * @param index The index of the element to return.
     * @return The equipedCardList at the given index.
     */
    int getEquipedCardList(int index);

    /**
     * <code>uint32 best_score = 2;</code>
     * @return The bestScore.
     */
    int getBestScore();
  }
  /**
   * <pre>
   * Obf: DAMDDJCAMKK
   * </pre>
   *
   * Protobuf type {@code IrodoriChessMapData}
   */
  public static final class IrodoriChessMapData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:IrodoriChessMapData)
      IrodoriChessMapDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use IrodoriChessMapData.newBuilder() to construct.
    private IrodoriChessMapData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private IrodoriChessMapData() {
      equipedCardList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new IrodoriChessMapData();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private IrodoriChessMapData(
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
            case 16: {

              bestScore_ = input.readUInt32();
              break;
            }
            case 40: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                equipedCardList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              equipedCardList_.addInt(input.readUInt32());
              break;
            }
            case 42: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                equipedCardList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                equipedCardList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 58: {
              emu.grasscutter.net.proto.IrodoriChessEntranceDetailInfoOuterClass.IrodoriChessEntranceDetailInfo.Builder subBuilder = null;
              if (entranceDetailInfo_ != null) {
                subBuilder = entranceDetailInfo_.toBuilder();
              }
              entranceDetailInfo_ = input.readMessage(emu.grasscutter.net.proto.IrodoriChessEntranceDetailInfoOuterClass.IrodoriChessEntranceDetailInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(entranceDetailInfo_);
                entranceDetailInfo_ = subBuilder.buildPartial();
              }

              break;
            }
            case 88: {

              mapId_ = input.readUInt32();
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
          equipedCardList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.internal_static_IrodoriChessMapData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.internal_static_IrodoriChessMapData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapData.class, emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapData.Builder.class);
    }

    public static final int MAP_ID_FIELD_NUMBER = 11;
    private int mapId_;
    /**
     * <code>uint32 map_id = 11;</code>
     * @return The mapId.
     */
    @java.lang.Override
    public int getMapId() {
      return mapId_;
    }

    public static final int ENTRANCE_DETAIL_INFO_FIELD_NUMBER = 7;
    private emu.grasscutter.net.proto.IrodoriChessEntranceDetailInfoOuterClass.IrodoriChessEntranceDetailInfo entranceDetailInfo_;
    /**
     * <code>.IrodoriChessEntranceDetailInfo entrance_detail_info = 7;</code>
     * @return Whether the entranceDetailInfo field is set.
     */
    @java.lang.Override
    public boolean hasEntranceDetailInfo() {
      return entranceDetailInfo_ != null;
    }
    /**
     * <code>.IrodoriChessEntranceDetailInfo entrance_detail_info = 7;</code>
     * @return The entranceDetailInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.IrodoriChessEntranceDetailInfoOuterClass.IrodoriChessEntranceDetailInfo getEntranceDetailInfo() {
      return entranceDetailInfo_ == null ? emu.grasscutter.net.proto.IrodoriChessEntranceDetailInfoOuterClass.IrodoriChessEntranceDetailInfo.getDefaultInstance() : entranceDetailInfo_;
    }
    /**
     * <code>.IrodoriChessEntranceDetailInfo entrance_detail_info = 7;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.IrodoriChessEntranceDetailInfoOuterClass.IrodoriChessEntranceDetailInfoOrBuilder getEntranceDetailInfoOrBuilder() {
      return getEntranceDetailInfo();
    }

    public static final int EQUIPED_CARD_LIST_FIELD_NUMBER = 5;
    private com.google.protobuf.Internal.IntList equipedCardList_;
    /**
     * <code>repeated uint32 equiped_card_list = 5;</code>
     * @return A list containing the equipedCardList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getEquipedCardListList() {
      return equipedCardList_;
    }
    /**
     * <code>repeated uint32 equiped_card_list = 5;</code>
     * @return The count of equipedCardList.
     */
    public int getEquipedCardListCount() {
      return equipedCardList_.size();
    }
    /**
     * <code>repeated uint32 equiped_card_list = 5;</code>
     * @param index The index of the element to return.
     * @return The equipedCardList at the given index.
     */
    public int getEquipedCardList(int index) {
      return equipedCardList_.getInt(index);
    }
    private int equipedCardListMemoizedSerializedSize = -1;

    public static final int BEST_SCORE_FIELD_NUMBER = 2;
    private int bestScore_;
    /**
     * <code>uint32 best_score = 2;</code>
     * @return The bestScore.
     */
    @java.lang.Override
    public int getBestScore() {
      return bestScore_;
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
      getSerializedSize();
      if (bestScore_ != 0) {
        output.writeUInt32(2, bestScore_);
      }
      if (getEquipedCardListList().size() > 0) {
        output.writeUInt32NoTag(42);
        output.writeUInt32NoTag(equipedCardListMemoizedSerializedSize);
      }
      for (int i = 0; i < equipedCardList_.size(); i++) {
        output.writeUInt32NoTag(equipedCardList_.getInt(i));
      }
      if (entranceDetailInfo_ != null) {
        output.writeMessage(7, getEntranceDetailInfo());
      }
      if (mapId_ != 0) {
        output.writeUInt32(11, mapId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (bestScore_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, bestScore_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < equipedCardList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(equipedCardList_.getInt(i));
        }
        size += dataSize;
        if (!getEquipedCardListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        equipedCardListMemoizedSerializedSize = dataSize;
      }
      if (entranceDetailInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(7, getEntranceDetailInfo());
      }
      if (mapId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, mapId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapData)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapData other = (emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapData) obj;

      if (getMapId()
          != other.getMapId()) return false;
      if (hasEntranceDetailInfo() != other.hasEntranceDetailInfo()) return false;
      if (hasEntranceDetailInfo()) {
        if (!getEntranceDetailInfo()
            .equals(other.getEntranceDetailInfo())) return false;
      }
      if (!getEquipedCardListList()
          .equals(other.getEquipedCardListList())) return false;
      if (getBestScore()
          != other.getBestScore()) return false;
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
      hash = (37 * hash) + MAP_ID_FIELD_NUMBER;
      hash = (53 * hash) + getMapId();
      if (hasEntranceDetailInfo()) {
        hash = (37 * hash) + ENTRANCE_DETAIL_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getEntranceDetailInfo().hashCode();
      }
      if (getEquipedCardListCount() > 0) {
        hash = (37 * hash) + EQUIPED_CARD_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getEquipedCardListList().hashCode();
      }
      hash = (37 * hash) + BEST_SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getBestScore();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapData parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapData prototype) {
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
     * <pre>
     * Obf: DAMDDJCAMKK
     * </pre>
     *
     * Protobuf type {@code IrodoriChessMapData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:IrodoriChessMapData)
        emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.internal_static_IrodoriChessMapData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.internal_static_IrodoriChessMapData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapData.class, emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapData.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapData.newBuilder()
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
        mapId_ = 0;

        if (entranceDetailInfoBuilder_ == null) {
          entranceDetailInfo_ = null;
        } else {
          entranceDetailInfo_ = null;
          entranceDetailInfoBuilder_ = null;
        }
        equipedCardList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        bestScore_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.internal_static_IrodoriChessMapData_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapData getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapData.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapData build() {
        emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapData buildPartial() {
        emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapData result = new emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapData(this);
        int from_bitField0_ = bitField0_;
        result.mapId_ = mapId_;
        if (entranceDetailInfoBuilder_ == null) {
          result.entranceDetailInfo_ = entranceDetailInfo_;
        } else {
          result.entranceDetailInfo_ = entranceDetailInfoBuilder_.build();
        }
        if (((bitField0_ & 0x00000001) != 0)) {
          equipedCardList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.equipedCardList_ = equipedCardList_;
        result.bestScore_ = bestScore_;
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
        if (other instanceof emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapData) {
          return mergeFrom((emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapData other) {
        if (other == emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapData.getDefaultInstance()) return this;
        if (other.getMapId() != 0) {
          setMapId(other.getMapId());
        }
        if (other.hasEntranceDetailInfo()) {
          mergeEntranceDetailInfo(other.getEntranceDetailInfo());
        }
        if (!other.equipedCardList_.isEmpty()) {
          if (equipedCardList_.isEmpty()) {
            equipedCardList_ = other.equipedCardList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureEquipedCardListIsMutable();
            equipedCardList_.addAll(other.equipedCardList_);
          }
          onChanged();
        }
        if (other.getBestScore() != 0) {
          setBestScore(other.getBestScore());
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
        emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapData parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapData) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int mapId_ ;
      /**
       * <code>uint32 map_id = 11;</code>
       * @return The mapId.
       */
      @java.lang.Override
      public int getMapId() {
        return mapId_;
      }
      /**
       * <code>uint32 map_id = 11;</code>
       * @param value The mapId to set.
       * @return This builder for chaining.
       */
      public Builder setMapId(int value) {
        
        mapId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 map_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearMapId() {
        
        mapId_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.IrodoriChessEntranceDetailInfoOuterClass.IrodoriChessEntranceDetailInfo entranceDetailInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.IrodoriChessEntranceDetailInfoOuterClass.IrodoriChessEntranceDetailInfo, emu.grasscutter.net.proto.IrodoriChessEntranceDetailInfoOuterClass.IrodoriChessEntranceDetailInfo.Builder, emu.grasscutter.net.proto.IrodoriChessEntranceDetailInfoOuterClass.IrodoriChessEntranceDetailInfoOrBuilder> entranceDetailInfoBuilder_;
      /**
       * <code>.IrodoriChessEntranceDetailInfo entrance_detail_info = 7;</code>
       * @return Whether the entranceDetailInfo field is set.
       */
      public boolean hasEntranceDetailInfo() {
        return entranceDetailInfoBuilder_ != null || entranceDetailInfo_ != null;
      }
      /**
       * <code>.IrodoriChessEntranceDetailInfo entrance_detail_info = 7;</code>
       * @return The entranceDetailInfo.
       */
      public emu.grasscutter.net.proto.IrodoriChessEntranceDetailInfoOuterClass.IrodoriChessEntranceDetailInfo getEntranceDetailInfo() {
        if (entranceDetailInfoBuilder_ == null) {
          return entranceDetailInfo_ == null ? emu.grasscutter.net.proto.IrodoriChessEntranceDetailInfoOuterClass.IrodoriChessEntranceDetailInfo.getDefaultInstance() : entranceDetailInfo_;
        } else {
          return entranceDetailInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.IrodoriChessEntranceDetailInfo entrance_detail_info = 7;</code>
       */
      public Builder setEntranceDetailInfo(emu.grasscutter.net.proto.IrodoriChessEntranceDetailInfoOuterClass.IrodoriChessEntranceDetailInfo value) {
        if (entranceDetailInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          entranceDetailInfo_ = value;
          onChanged();
        } else {
          entranceDetailInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.IrodoriChessEntranceDetailInfo entrance_detail_info = 7;</code>
       */
      public Builder setEntranceDetailInfo(
          emu.grasscutter.net.proto.IrodoriChessEntranceDetailInfoOuterClass.IrodoriChessEntranceDetailInfo.Builder builderForValue) {
        if (entranceDetailInfoBuilder_ == null) {
          entranceDetailInfo_ = builderForValue.build();
          onChanged();
        } else {
          entranceDetailInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.IrodoriChessEntranceDetailInfo entrance_detail_info = 7;</code>
       */
      public Builder mergeEntranceDetailInfo(emu.grasscutter.net.proto.IrodoriChessEntranceDetailInfoOuterClass.IrodoriChessEntranceDetailInfo value) {
        if (entranceDetailInfoBuilder_ == null) {
          if (entranceDetailInfo_ != null) {
            entranceDetailInfo_ =
              emu.grasscutter.net.proto.IrodoriChessEntranceDetailInfoOuterClass.IrodoriChessEntranceDetailInfo.newBuilder(entranceDetailInfo_).mergeFrom(value).buildPartial();
          } else {
            entranceDetailInfo_ = value;
          }
          onChanged();
        } else {
          entranceDetailInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.IrodoriChessEntranceDetailInfo entrance_detail_info = 7;</code>
       */
      public Builder clearEntranceDetailInfo() {
        if (entranceDetailInfoBuilder_ == null) {
          entranceDetailInfo_ = null;
          onChanged();
        } else {
          entranceDetailInfo_ = null;
          entranceDetailInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.IrodoriChessEntranceDetailInfo entrance_detail_info = 7;</code>
       */
      public emu.grasscutter.net.proto.IrodoriChessEntranceDetailInfoOuterClass.IrodoriChessEntranceDetailInfo.Builder getEntranceDetailInfoBuilder() {
        
        onChanged();
        return getEntranceDetailInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.IrodoriChessEntranceDetailInfo entrance_detail_info = 7;</code>
       */
      public emu.grasscutter.net.proto.IrodoriChessEntranceDetailInfoOuterClass.IrodoriChessEntranceDetailInfoOrBuilder getEntranceDetailInfoOrBuilder() {
        if (entranceDetailInfoBuilder_ != null) {
          return entranceDetailInfoBuilder_.getMessageOrBuilder();
        } else {
          return entranceDetailInfo_ == null ?
              emu.grasscutter.net.proto.IrodoriChessEntranceDetailInfoOuterClass.IrodoriChessEntranceDetailInfo.getDefaultInstance() : entranceDetailInfo_;
        }
      }
      /**
       * <code>.IrodoriChessEntranceDetailInfo entrance_detail_info = 7;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.IrodoriChessEntranceDetailInfoOuterClass.IrodoriChessEntranceDetailInfo, emu.grasscutter.net.proto.IrodoriChessEntranceDetailInfoOuterClass.IrodoriChessEntranceDetailInfo.Builder, emu.grasscutter.net.proto.IrodoriChessEntranceDetailInfoOuterClass.IrodoriChessEntranceDetailInfoOrBuilder> 
          getEntranceDetailInfoFieldBuilder() {
        if (entranceDetailInfoBuilder_ == null) {
          entranceDetailInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.IrodoriChessEntranceDetailInfoOuterClass.IrodoriChessEntranceDetailInfo, emu.grasscutter.net.proto.IrodoriChessEntranceDetailInfoOuterClass.IrodoriChessEntranceDetailInfo.Builder, emu.grasscutter.net.proto.IrodoriChessEntranceDetailInfoOuterClass.IrodoriChessEntranceDetailInfoOrBuilder>(
                  getEntranceDetailInfo(),
                  getParentForChildren(),
                  isClean());
          entranceDetailInfo_ = null;
        }
        return entranceDetailInfoBuilder_;
      }

      private com.google.protobuf.Internal.IntList equipedCardList_ = emptyIntList();
      private void ensureEquipedCardListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          equipedCardList_ = mutableCopy(equipedCardList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 equiped_card_list = 5;</code>
       * @return A list containing the equipedCardList.
       */
      public java.util.List<java.lang.Integer>
          getEquipedCardListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(equipedCardList_) : equipedCardList_;
      }
      /**
       * <code>repeated uint32 equiped_card_list = 5;</code>
       * @return The count of equipedCardList.
       */
      public int getEquipedCardListCount() {
        return equipedCardList_.size();
      }
      /**
       * <code>repeated uint32 equiped_card_list = 5;</code>
       * @param index The index of the element to return.
       * @return The equipedCardList at the given index.
       */
      public int getEquipedCardList(int index) {
        return equipedCardList_.getInt(index);
      }
      /**
       * <code>repeated uint32 equiped_card_list = 5;</code>
       * @param index The index to set the value at.
       * @param value The equipedCardList to set.
       * @return This builder for chaining.
       */
      public Builder setEquipedCardList(
          int index, int value) {
        ensureEquipedCardListIsMutable();
        equipedCardList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 equiped_card_list = 5;</code>
       * @param value The equipedCardList to add.
       * @return This builder for chaining.
       */
      public Builder addEquipedCardList(int value) {
        ensureEquipedCardListIsMutable();
        equipedCardList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 equiped_card_list = 5;</code>
       * @param values The equipedCardList to add.
       * @return This builder for chaining.
       */
      public Builder addAllEquipedCardList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureEquipedCardListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, equipedCardList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 equiped_card_list = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearEquipedCardList() {
        equipedCardList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int bestScore_ ;
      /**
       * <code>uint32 best_score = 2;</code>
       * @return The bestScore.
       */
      @java.lang.Override
      public int getBestScore() {
        return bestScore_;
      }
      /**
       * <code>uint32 best_score = 2;</code>
       * @param value The bestScore to set.
       * @return This builder for chaining.
       */
      public Builder setBestScore(int value) {
        
        bestScore_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 best_score = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearBestScore() {
        
        bestScore_ = 0;
        onChanged();
        return this;
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


      // @@protoc_insertion_point(builder_scope:IrodoriChessMapData)
    }

    // @@protoc_insertion_point(class_scope:IrodoriChessMapData)
    private static final emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapData();
    }

    public static emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<IrodoriChessMapData>
        PARSER = new com.google.protobuf.AbstractParser<IrodoriChessMapData>() {
      @java.lang.Override
      public IrodoriChessMapData parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new IrodoriChessMapData(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<IrodoriChessMapData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<IrodoriChessMapData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.IrodoriChessMapDataOuterClass.IrodoriChessMapData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_IrodoriChessMapData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_IrodoriChessMapData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031IrodoriChessMapData.proto\032$IrodoriChes" +
      "sEntranceDetailInfo.proto\"\223\001\n\023IrodoriChe" +
      "ssMapData\022\016\n\006map_id\030\013 \001(\r\022=\n\024entrance_de" +
      "tail_info\030\007 \001(\0132\037.IrodoriChessEntranceDe" +
      "tailInfo\022\031\n\021equiped_card_list\030\005 \003(\r\022\022\n\nb" +
      "est_score\030\002 \001(\rB\033\n\031emu.grasscutter.net.p" +
      "rotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.IrodoriChessEntranceDetailInfoOuterClass.getDescriptor(),
        });
    internal_static_IrodoriChessMapData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_IrodoriChessMapData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_IrodoriChessMapData_descriptor,
        new java.lang.String[] { "MapId", "EntranceDetailInfo", "EquipedCardList", "BestScore", });
    emu.grasscutter.net.proto.IrodoriChessEntranceDetailInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}