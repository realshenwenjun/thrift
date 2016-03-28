/**
 * Autogenerated by Thrift Compiler (0.9.2)
 * <p/>
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *
 * @generated
 */
package com.shenwenjun.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2016-3-27")
public class User implements org.apache.thrift.TBase<User, User._Fields>, java.io.Serializable, Cloneable, Comparable<User> {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("User");

    private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.STRING, (short) 1);
    private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short) 2);
    private static final org.apache.thrift.protocol.TField SEX_FIELD_DESC = new org.apache.thrift.protocol.TField("sex", org.apache.thrift.protocol.TType.I32, (short) 3);

    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();

    static {
        schemes.put(StandardScheme.class, new UserStandardSchemeFactory());
        schemes.put(TupleScheme.class, new UserTupleSchemeFactory());
    }

    public String id; // required
    public String name; // required
    public int sex; // required

    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
        ID((short) 1, "id"),
        NAME((short) 2, "name"),
        SEX((short) 3, "sex");

        private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

        static {
            for (_Fields field : EnumSet.allOf(_Fields.class)) {
                byName.put(field.getFieldName(), field);
            }
        }

        /**
         * Find the _Fields constant that matches fieldId, or null if its not found.
         */
        public static _Fields findByThriftId(int fieldId) {
            switch (fieldId) {
                case 1: // ID
                    return ID;
                case 2: // NAME
                    return NAME;
                case 3: // SEX
                    return SEX;
                default:
                    return null;
            }
        }

        /**
         * Find the _Fields constant that matches fieldId, throwing an exception
         * if it is not found.
         */
        public static _Fields findByThriftIdOrThrow(int fieldId) {
            _Fields fields = findByThriftId(fieldId);
            if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
            return fields;
        }

        /**
         * Find the _Fields constant that matches name, or null if its not found.
         */
        public static _Fields findByName(String name) {
            return byName.get(name);
        }

        private final short _thriftId;
        private final String _fieldName;

        _Fields(short thriftId, String fieldName) {
            _thriftId = thriftId;
            _fieldName = fieldName;
        }

        public short getThriftFieldId() {
            return _thriftId;
        }

        public String getFieldName() {
            return _fieldName;
        }
    }

    // isset id assignments
    private static final int __SEX_ISSET_ID = 0;
    private byte __isset_bitfield = 0;
    public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;

    static {
        Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
        tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.DEFAULT,
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
        tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.DEFAULT,
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
        tmpMap.put(_Fields.SEX, new org.apache.thrift.meta_data.FieldMetaData("sex", org.apache.thrift.TFieldRequirementType.DEFAULT,
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
        metaDataMap = Collections.unmodifiableMap(tmpMap);
        org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(User.class, metaDataMap);
    }

    public User() {
    }

    public User(
            String id,
            String name,
            int sex) {
        this();
        this.id = id;
        this.name = name;
        this.sex = sex;
        setSexIsSet(true);
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public User(User other) {
        __isset_bitfield = other.__isset_bitfield;
        if (other.isSetId()) {
            this.id = other.id;
        }
        if (other.isSetName()) {
            this.name = other.name;
        }
        this.sex = other.sex;
    }

    public User deepCopy() {
        return new User(this);
    }

    public void clear() {
        this.id = null;
        this.name = null;
        setSexIsSet(false);
        this.sex = 0;
    }

    public String getId() {
        return this.id;
    }

    public User setId(String id) {
        this.id = id;
        return this;
    }

    public void unsetId() {
        this.id = null;
    }

    /** Returns true if field id is set (has been assigned a value) and false otherwise */
    public boolean isSetId() {
        return this.id != null;
    }

    public void setIdIsSet(boolean value) {
        if (!value) {
            this.id = null;
        }
    }

    public String getName() {
        return this.name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public void unsetName() {
        this.name = null;
    }

    /** Returns true if field name is set (has been assigned a value) and false otherwise */
    public boolean isSetName() {
        return this.name != null;
    }

    public void setNameIsSet(boolean value) {
        if (!value) {
            this.name = null;
        }
    }

    public int getSex() {
        return this.sex;
    }

    public User setSex(int sex) {
        this.sex = sex;
        setSexIsSet(true);
        return this;
    }

    public void unsetSex() {
        __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SEX_ISSET_ID);
    }

    /** Returns true if field sex is set (has been assigned a value) and false otherwise */
    public boolean isSetSex() {
        return EncodingUtils.testBit(__isset_bitfield, __SEX_ISSET_ID);
    }

    public void setSexIsSet(boolean value) {
        __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SEX_ISSET_ID, value);
    }

    public void setFieldValue(_Fields field, Object value) {
        switch (field) {
            case ID:
                if (value == null) {
                    unsetId();
                } else {
                    setId((String) value);
                }
                break;

            case NAME:
                if (value == null) {
                    unsetName();
                } else {
                    setName((String) value);
                }
                break;

            case SEX:
                if (value == null) {
                    unsetSex();
                } else {
                    setSex((Integer) value);
                }
                break;

        }
    }

    public Object getFieldValue(_Fields field) {
        switch (field) {
            case ID:
                return getId();

            case NAME:
                return getName();

            case SEX:
                return Integer.valueOf(getSex());

        }
        throw new IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }

        switch (field) {
            case ID:
                return isSetId();
            case NAME:
                return isSetName();
            case SEX:
                return isSetSex();
        }
        throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
        if (that == null)
            return false;
        if (that instanceof User)
            return this.equals((User) that);
        return false;
    }

    public boolean equals(User that) {
        if (that == null)
            return false;

        boolean this_present_id = true && this.isSetId();
        boolean that_present_id = true && that.isSetId();
        if (this_present_id || that_present_id) {
            if (!(this_present_id && that_present_id))
                return false;
            if (!this.id.equals(that.id))
                return false;
        }

        boolean this_present_name = true && this.isSetName();
        boolean that_present_name = true && that.isSetName();
        if (this_present_name || that_present_name) {
            if (!(this_present_name && that_present_name))
                return false;
            if (!this.name.equals(that.name))
                return false;
        }

        boolean this_present_sex = true;
        boolean that_present_sex = true;
        if (this_present_sex || that_present_sex) {
            if (!(this_present_sex && that_present_sex))
                return false;
            if (this.sex != that.sex)
                return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        List<Object> list = new ArrayList<Object>();

        boolean present_id = true && (isSetId());
        list.add(present_id);
        if (present_id)
            list.add(id);

        boolean present_name = true && (isSetName());
        list.add(present_name);
        if (present_name)
            list.add(name);

        boolean present_sex = true;
        list.add(present_sex);
        if (present_sex)
            list.add(sex);

        return list.hashCode();
    }

    public int compareTo(User other) {
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }

        int lastComparison = 0;

        lastComparison = Boolean.valueOf(isSetId()).compareTo(other.isSetId());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetId()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, other.id);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetName()).compareTo(other.isSetName());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetName()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetSex()).compareTo(other.isSetSex());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetSex()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sex, other.sex);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        return 0;
    }

    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    public void read(org.apache.thrift.protocol.TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("User(");
        boolean first = true;

        sb.append("id:");
        if (this.id == null) {
            sb.append("null");
        } else {
            sb.append(this.id);
        }
        first = false;
        if (!first) sb.append(", ");
        sb.append("name:");
        if (this.name == null) {
            sb.append("null");
        } else {
            sb.append(this.name);
        }
        first = false;
        if (!first) sb.append(", ");
        sb.append("sex:");
        sb.append(this.sex);
        first = false;
        sb.append(")");
        return sb.toString();
    }

    public void validate() throws TException {
        // check for required fields
        // check for sub-struct validity
    }

    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        try {
            write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
        } catch (TException te) {
            throw new java.io.IOException(te);
        }
    }

    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
        try {
            // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
            __isset_bitfield = 0;
            read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
        } catch (TException te) {
            throw new java.io.IOException(te);
        }
    }

    private static class UserStandardSchemeFactory implements SchemeFactory {
        public UserStandardScheme getScheme() {
            return new UserStandardScheme();
        }
    }

    private static class UserStandardScheme extends StandardScheme<User> {

        public void read(org.apache.thrift.protocol.TProtocol iprot, User struct) throws TException {
            org.apache.thrift.protocol.TField schemeField;
            iprot.readStructBegin();
            while (true) {
                schemeField = iprot.readFieldBegin();
                if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
                    break;
                }
                switch (schemeField.id) {
                    case 1: // ID
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                            struct.id = iprot.readString();
                            struct.setIdIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case 2: // NAME
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                            struct.name = iprot.readString();
                            struct.setNameIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case 3: // SEX
                        if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
                            struct.sex = iprot.readI32();
                            struct.setSexIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    default:
                        org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();

            // check for required fields of primitive type, which can't be checked in the validate method
            struct.validate();
        }

        public void write(org.apache.thrift.protocol.TProtocol oprot, User struct) throws TException {
            struct.validate();

            oprot.writeStructBegin(STRUCT_DESC);
            if (struct.id != null) {
                oprot.writeFieldBegin(ID_FIELD_DESC);
                oprot.writeString(struct.id);
                oprot.writeFieldEnd();
            }
            if (struct.name != null) {
                oprot.writeFieldBegin(NAME_FIELD_DESC);
                oprot.writeString(struct.name);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(SEX_FIELD_DESC);
            oprot.writeI32(struct.sex);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }

    }

    private static class UserTupleSchemeFactory implements SchemeFactory {
        public UserTupleScheme getScheme() {
            return new UserTupleScheme();
        }
    }

    private static class UserTupleScheme extends TupleScheme<User> {

        public void write(org.apache.thrift.protocol.TProtocol prot, User struct) throws TException {
            TTupleProtocol oprot = (TTupleProtocol) prot;
            BitSet optionals = new BitSet();
            if (struct.isSetId()) {
                optionals.set(0);
            }
            if (struct.isSetName()) {
                optionals.set(1);
            }
            if (struct.isSetSex()) {
                optionals.set(2);
            }
            oprot.writeBitSet(optionals, 3);
            if (struct.isSetId()) {
                oprot.writeString(struct.id);
            }
            if (struct.isSetName()) {
                oprot.writeString(struct.name);
            }
            if (struct.isSetSex()) {
                oprot.writeI32(struct.sex);
            }
        }

        public void read(org.apache.thrift.protocol.TProtocol prot, User struct) throws TException {
            TTupleProtocol iprot = (TTupleProtocol) prot;
            BitSet incoming = iprot.readBitSet(3);
            if (incoming.get(0)) {
                struct.id = iprot.readString();
                struct.setIdIsSet(true);
            }
            if (incoming.get(1)) {
                struct.name = iprot.readString();
                struct.setNameIsSet(true);
            }
            if (incoming.get(2)) {
                struct.sex = iprot.readI32();
                struct.setSexIsSet(true);
            }
        }
    }

}

