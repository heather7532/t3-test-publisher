/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.alpenlogic.tools.examples.avro;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class Message extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 8084278332876036120L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Message\",\"namespace\":\"org.alpenlogic.tools.examples\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"logicalType\":\"uuid\"}},{\"name\":\"contentType\",\"type\":\"string\"},{\"name\":\"content\",\"type\":\"string\"},{\"name\":\"timeSent\",\"type\":{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();
  static {
    MODEL$.addLogicalTypeConversion(new org.apache.avro.Conversions.UUIDConversion());
    MODEL$.addLogicalTypeConversion(new org.apache.avro.data.TimeConversions.TimestampMillisConversion());
  }

  private static final BinaryMessageEncoder<Message> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Message> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Message> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Message> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Message> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Message to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Message from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Message instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Message fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.util.UUID id;
  private java.lang.CharSequence contentType;
  private java.lang.CharSequence content;
  private java.time.Instant timeSent;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Message() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param contentType The new value for contentType
   * @param content The new value for content
   * @param timeSent The new value for timeSent
   */
  public Message(java.util.UUID id, java.lang.CharSequence contentType, java.lang.CharSequence content, java.time.Instant timeSent) {
    this.id = id;
    this.contentType = contentType;
    this.content = content;
    this.timeSent = timeSent.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return contentType;
    case 2: return content;
    case 3: return timeSent;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  private static final org.apache.avro.Conversion<?>[] conversions =
      new org.apache.avro.Conversion<?>[] {
      new org.apache.avro.Conversions.UUIDConversion(),
      null,
      null,
      new org.apache.avro.data.TimeConversions.TimestampMillisConversion(),
      null
  };

  @Override
  public org.apache.avro.Conversion<?> getConversion(int field) {
    return conversions[field];
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.util.UUID)value$; break;
    case 1: contentType = (java.lang.CharSequence)value$; break;
    case 2: content = (java.lang.CharSequence)value$; break;
    case 3: timeSent = (java.time.Instant)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public java.util.UUID getId() {
    return id;
  }


  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.util.UUID value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'contentType' field.
   * @return The value of the 'contentType' field.
   */
  public java.lang.CharSequence getContentType() {
    return contentType;
  }


  /**
   * Sets the value of the 'contentType' field.
   * @param value the value to set.
   */
  public void setContentType(java.lang.CharSequence value) {
    this.contentType = value;
  }

  /**
   * Gets the value of the 'content' field.
   * @return The value of the 'content' field.
   */
  public java.lang.CharSequence getContent() {
    return content;
  }


  /**
   * Sets the value of the 'content' field.
   * @param value the value to set.
   */
  public void setContent(java.lang.CharSequence value) {
    this.content = value;
  }

  /**
   * Gets the value of the 'timeSent' field.
   * @return The value of the 'timeSent' field.
   */
  public java.time.Instant getTimeSent() {
    return timeSent;
  }


  /**
   * Sets the value of the 'timeSent' field.
   * @param value the value to set.
   */
  public void setTimeSent(java.time.Instant value) {
    this.timeSent = value.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);
  }

  /**
   * Creates a new Message RecordBuilder.
   * @return A new Message RecordBuilder
   */
  public static Message.Builder newBuilder() {
    return new Message.Builder();
  }

  /**
   * Creates a new Message RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Message RecordBuilder
   */
  public static Message.Builder newBuilder(Message.Builder other) {
    if (other == null) {
      return new Message.Builder();
    } else {
      return new Message.Builder(other);
    }
  }

  /**
   * Creates a new Message RecordBuilder by copying an existing Message instance.
   * @param other The existing instance to copy.
   * @return A new Message RecordBuilder
   */
  public static Message.Builder newBuilder(Message other) {
    if (other == null) {
      return new Message.Builder();
    } else {
      return new Message.Builder(other);
    }
  }

  /**
   * RecordBuilder for Message instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Message>
    implements org.apache.avro.data.RecordBuilder<Message> {

    private java.util.UUID id;
    private java.lang.CharSequence contentType;
    private java.lang.CharSequence content;
    private java.time.Instant timeSent;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(Message.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.contentType)) {
        this.contentType = data().deepCopy(fields()[1].schema(), other.contentType);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.content)) {
        this.content = data().deepCopy(fields()[2].schema(), other.content);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.timeSent)) {
        this.timeSent = data().deepCopy(fields()[3].schema(), other.timeSent);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
    }

    /**
     * Creates a Builder by copying an existing Message instance
     * @param other The existing instance to copy.
     */
    private Builder(Message other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.contentType)) {
        this.contentType = data().deepCopy(fields()[1].schema(), other.contentType);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.content)) {
        this.content = data().deepCopy(fields()[2].schema(), other.content);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.timeSent)) {
        this.timeSent = data().deepCopy(fields()[3].schema(), other.timeSent);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public java.util.UUID getId() {
      return id;
    }


    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public Message.Builder setId(java.util.UUID value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public Message.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'contentType' field.
      * @return The value.
      */
    public java.lang.CharSequence getContentType() {
      return contentType;
    }


    /**
      * Sets the value of the 'contentType' field.
      * @param value The value of 'contentType'.
      * @return This builder.
      */
    public Message.Builder setContentType(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.contentType = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'contentType' field has been set.
      * @return True if the 'contentType' field has been set, false otherwise.
      */
    public boolean hasContentType() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'contentType' field.
      * @return This builder.
      */
    public Message.Builder clearContentType() {
      contentType = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'content' field.
      * @return The value.
      */
    public java.lang.CharSequence getContent() {
      return content;
    }


    /**
      * Sets the value of the 'content' field.
      * @param value The value of 'content'.
      * @return This builder.
      */
    public Message.Builder setContent(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.content = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'content' field has been set.
      * @return True if the 'content' field has been set, false otherwise.
      */
    public boolean hasContent() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'content' field.
      * @return This builder.
      */
    public Message.Builder clearContent() {
      content = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'timeSent' field.
      * @return The value.
      */
    public java.time.Instant getTimeSent() {
      return timeSent;
    }


    /**
      * Sets the value of the 'timeSent' field.
      * @param value The value of 'timeSent'.
      * @return This builder.
      */
    public Message.Builder setTimeSent(java.time.Instant value) {
      validate(fields()[3], value);
      this.timeSent = value.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'timeSent' field has been set.
      * @return True if the 'timeSent' field has been set, false otherwise.
      */
    public boolean hasTimeSent() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'timeSent' field.
      * @return This builder.
      */
    public Message.Builder clearTimeSent() {
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Message build() {
      try {
        Message record = new Message();
        record.id = fieldSetFlags()[0] ? this.id : (java.util.UUID) defaultValue(fields()[0]);
        record.contentType = fieldSetFlags()[1] ? this.contentType : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.content = fieldSetFlags()[2] ? this.content : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.timeSent = fieldSetFlags()[3] ? this.timeSent : (java.time.Instant) defaultValue(fields()[3]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Message>
    WRITER$ = (org.apache.avro.io.DatumWriter<Message>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Message>
    READER$ = (org.apache.avro.io.DatumReader<Message>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}










