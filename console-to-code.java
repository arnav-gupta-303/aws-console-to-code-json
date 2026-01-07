import java.util.Arrays;
import software.amazon.awssdk.services.ec2.ec2Client;
import software.amazon.awssdk.services.ec2.model.*;

CreateVpcRequest.builder()
                .amazonProvidedIpv6CidrBlock(false)
                .instanceTenancy("default")
                .cidrBlock("10.0.0.0/16")
                .tagSpecifications(Arrays.asList(resourceType("vpc").tags(Arrays.asList(key("my-first-vpc").value("learning")))))
                .build();

ec2Client.createVpc(request);
