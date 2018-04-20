package com.filip.payment;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import java.io.IOException;
import com.filip.grpc.payment.PaymentProto;;

// import com.filip.grpc.payment.RouteGuideGrpc.RouteGuideStub;

public class PaymentServer
{
    private final int port;
    private final Server server = null;

    public PaymentServer(int port) throws IOException {
        this(ServerBuilder.forPort(port), port);
    }

    /** Create a RouteGuide server using serverBuilder as a base and features as data. */
    public PaymentServer(ServerBuilder<?> serverBuilder, int port) {
        this.port = port;
    //    server = serverBuilder.addService(new PaymentService())
    //            .build();
    }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

}

class PaymentService //Need to extend this
{
    public PaymentService(){

    }
}