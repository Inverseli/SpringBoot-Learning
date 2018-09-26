package com.inverseli.learning;

import org.springframework.core.convert.converter.Converter;
import org.springframework.core.serializer.support.DeserializingConverter;
import org.springframework.core.serializer.support.SerializingConverter;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.SerializationException;

/**  
 * @date：2018年9月26日 下午12:46:01    
 * @author liyuhao
 * @version 1.0   
 * @since JDK 1.8  
 * @description：  =
 */
public class RedisObjectSerializer implements RedisSerializer<Object>{
	
	// 序列化的作用？
	  // 序列化 Object->byte
	  private Converter<Object, byte[]> serializer = new SerializingConverter();
	  // 反序列化 byte-> Object
	  private Converter<byte[], Object> deserializer = new DeserializingConverter();

	  static final byte[] EMPTY_ARRAY = new byte[0];

	  public Object deserialize(byte[] bytes) {
	    if (isEmpty(bytes)) {
	      return null;
	    }

	    try {
	      return deserializer.convert(bytes);
	    } catch (Exception ex) {
	      throw new SerializationException("Cannot deserialize", ex);
	    }
	  }

	  public byte[] serialize(Object object) {
	    if (object == null) {
	      return EMPTY_ARRAY;
	    }

	    try {
	      return serializer.convert(object);
	    } catch (Exception ex) {
	      return EMPTY_ARRAY;
	    }
	  }

	  private boolean isEmpty(byte[] data) {
	    return (data == null || data.length == 0);
	  }

}
  
