package com.accolite.kafka.springbootkafkaproducer.resource;
import com.accolite.kafka.springbootkafkaproducer.model.OrderDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kafka")
public class UserResource {

    @Autowired
    KafkaTemplate<String, OrderDetails> kafkaTemplate;
    private  static  final  String TOPIC = "Order_Details";

    @GetMapping("/publish/{userName}")
    public String post(@PathVariable("userName") final String message)
    {
        kafkaTemplate.send(TOPIC,new OrderDetails("Saumya","Pastries",2,200));
        return "Published Successfully";
    }

}