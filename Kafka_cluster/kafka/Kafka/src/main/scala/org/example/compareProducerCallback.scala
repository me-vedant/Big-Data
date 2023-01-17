package org.example

import org.apache.kafka.clients.producer.{Callback, RecordMetadata}

// Callback trait only contains the one abstract method onCompletion
private class compareProducerCallback extends Callback {
  @Override
  override def onCompletion(metadata: RecordMetadata, exception: Exception): Unit = {
    println("Record Metadata :: ")
    println(metadata.topic())
    println(metadata.partition())
    println(metadata.offset())
    if (exception != null) {
      exception.printStackTrace()
    }
  }
}