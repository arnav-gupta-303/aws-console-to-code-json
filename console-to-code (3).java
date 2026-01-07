import java.util.Arrays;
import software.amazon.awssdk.services.ec2.ec2Client;
import software.amazon.awssdk.services.ec2.model.*;
import software.amazon.awssdk.services.ram.ramClient;
import software.amazon.awssdk.services.ram.model.*;
import software.amazon.awssdk.services.health.healthClient;
import software.amazon.awssdk.services.health.model.*;
import software.amazon.awssdk.services.cloudwatch.cloudwatchClient;
import software.amazon.awssdk.services.cloudwatch.model.*;
import software.amazon.awssdk.services.autoscaling.autoscalingClient;
import software.amazon.awssdk.services.autoscaling.model.*;
import software.amazon.awssdk.services.route53resolver.route53resolverClient;
import software.amazon.awssdk.services.route53resolver.model.*;
import software.amazon.awssdk.services.compute-optimizer.compute-optimizerClient;
import software.amazon.awssdk.services.compute-optimizer.model.*;
import software.amazon.awssdk.services.ssm.ssmClient;
import software.amazon.awssdk.services.ssm.model.*;

DescribeNetworkAclsRequest.builder()
                .maxResults(1000)
                .build();

ec2Client.describeNetworkAcls(request);

DescribeAvailabilityZonesRequest.builder()
                .allAvailabilityZones(true)
                .build();

ec2Client.describeAvailabilityZones(request);

DescribeRouteTablesRequest.builder()
                .maxResults(100)
                .build();

ec2Client.describeRouteTables(request);

DescribeSubnetsRequest.builder()
                .maxResults(1000)
                .build();

ec2Client.describeSubnets(request);

DescribeIpamPoolsRequest.builder()
                .maxResults(100)
                .build();

ec2Client.describeIpamPools(request);

DescribeTagsRequest.builder()
                .filters(Arrays.asList(name("key").values(Arrays.asList("Name")), name("value").values(Arrays.asList("-subnet-01*"))))
                .maxResults(1000)
                .build();

ec2Client.describeTags(request);

DescribeTagsRequest.builder()
                .filters(Arrays.asList(name("key").values(Arrays.asList("Name")), name("value").values(Arrays.asList("p-subnet-01*"))))
                .maxResults(1000)
                .build();

ec2Client.describeTags(request);

DescribeTagsRequest.builder()
                .filters(Arrays.asList(name("key").values(Arrays.asList("Name")), name("value").values(Arrays.asList("pu-subnet-01*"))))
                .maxResults(1000)
                .build();

ec2Client.describeTags(request);

DescribeTagsRequest.builder()
                .filters(Arrays.asList(name("key").values(Arrays.asList("Name")), name("value").values(Arrays.asList("pub-subnet-01*"))))
                .maxResults(1000)
                .build();

ec2Client.describeTags(request);

DescribeTagsRequest.builder()
                .filters(Arrays.asList(name("key").values(Arrays.asList("Name")), name("value").values(Arrays.asList("publ-subnet-01*"))))
                .maxResults(1000)
                .build();

ec2Client.describeTags(request);

DescribeTagsRequest.builder()
                .filters(Arrays.asList(name("key").values(Arrays.asList("Name")), name("value").values(Arrays.asList("publi-subnet-01*"))))
                .maxResults(1000)
                .build();

ec2Client.describeTags(request);

DescribeTagsRequest.builder()
                .filters(Arrays.asList(name("key").values(Arrays.asList("Name")), name("value").values(Arrays.asList("public-subnet-01*"))))
                .maxResults(1000)
                .build();

ec2Client.describeTags(request);

DescribeTagsRequest.builder()
                .filters(Arrays.asList(name("key").values(Arrays.asList("Name")), name("value").values(Arrays.asList("public-subnet-*"))))
                .maxResults(1000)
                .build();

ec2Client.describeTags(request);

DescribeTagsRequest.builder()
                .filters(Arrays.asList(name("key").values(Arrays.asList("Name")), name("value").values(Arrays.asList("public-subnet-1*"))))
                .maxResults(1000)
                .build();

ec2Client.describeTags(request);

DescribeTagsRequest.builder()
                .filters(Arrays.asList(name("key").values(Arrays.asList("Name")), name("value").values(Arrays.asList("public-subnet-1a*"))))
                .maxResults(1000)
                .build();

ec2Client.describeTags(request);

CreateSubnetRequest.builder()
                .vpcId("vpc-0ce910c39715c2618")
                .cidrBlock("10.0.1.0/24")
                .availabilityZoneId("aps1-az1")
                .tagSpecifications(Arrays.asList(resourceType("subnet").tags(Arrays.asList(key("Name").value("public-subnet-1a")))))
                .build();

ec2Client.createSubnet(request);

DescribeSubnetsRequest.builder()
                .maxResults(1000)
                .build();

ec2Client.describeSubnets(request);

DescribeInternetGatewaysRequest.builder()
                .maxResults(1000)
                .build();

ec2Client.describeInternetGateways(request);

DescribeInternetGatewaysRequest.builder()
                .maxResults(1000)
                .build();

ec2Client.describeInternetGateways(request);

DescribeNatGatewaysRequest.builder()

                .build();

ec2Client.describeNatGateways(request);

DescribeVpcsRequest.builder()
                .maxResults(1000)
                .build();

ec2Client.describeVpcs(request);

CreateInternetGatewayRequest.builder()
                .tagSpecifications(Arrays.asList(resourceType("internet-gateway").tags(Arrays.asList(key("Name").value("my-internet-gateway")))))
                .build();

ec2Client.createInternetGateway(request);

DescribeInternetGatewaysRequest.builder()
                .internetGatewayIds(Arrays.asList("igw-07a03204e0d2e6832"))
                .build();

ec2Client.describeInternetGateways(request);

DescribeInternetGatewaysRequest.builder()
                .internetGatewayIds(Arrays.asList("igw-07a03204e0d2e6832"))
                .build();

ec2Client.describeInternetGateways(request);

DescribeNatGatewaysRequest.builder()

                .build();

ec2Client.describeNatGateways(request);

DescribeVpcsRequest.builder()
                .maxResults(1000)
                .build();

ec2Client.describeVpcs(request);

DescribeInternetGatewaysRequest.builder()

                .build();

ec2Client.describeInternetGateways(request);

DescribeVpcsRequest.builder()

                .build();

ec2Client.describeVpcs(request);

AttachInternetGatewayRequest.builder()
                .vpcId("vpc-0ce910c39715c2618")
                .internetGatewayId("igw-07a03204e0d2e6832")
                .build();

ec2Client.attachInternetGateway(request);

DescribeInternetGatewaysRequest.builder()
                .internetGatewayIds(Arrays.asList("igw-07a03204e0d2e6832"))
                .build();

ec2Client.describeInternetGateways(request);

DescribeInternetGatewaysRequest.builder()
                .internetGatewayIds(Arrays.asList("igw-07a03204e0d2e6832"))
                .build();

ec2Client.describeInternetGateways(request);

DescribeVpcsRequest.builder()
                .vpcIds(Arrays.asList("vpc-0ce910c39715c2618"))
                .build();

ec2Client.describeVpcs(request);

DescribeVpcsRequest.builder()
                .maxResults(1000)
                .build();

ec2Client.describeVpcs(request);

DescribeNatGatewaysRequest.builder()

                .build();

ec2Client.describeNatGateways(request);

DescribeAccountAttributesRequest.builder()
                .attributeNames(Arrays.asList("default-vpc", "supported-platforms"))
                .build();

ec2Client.describeAccountAttributes(request);

DescribeInternetGatewaysRequest.builder()
                .maxResults(1000)
                .build();

ec2Client.describeInternetGateways(request);

DescribeInternetGatewaysRequest.builder()
                .maxResults(1000)
                .build();

ec2Client.describeInternetGateways(request);

DescribeNatGatewaysRequest.builder()

                .build();

ec2Client.describeNatGateways(request);

DescribeVpcsRequest.builder()
                .maxResults(1000)
                .build();

ec2Client.describeVpcs(request);

CreateTagsRequest.builder()
                .resources(Arrays.asList("igw-07a03204e0d2e6832"))
                .tags(Arrays.asList(key("Name").value("igw-my-first-vpc")))
                .build();

ec2Client.createTags(request);

DescribeInternetGatewaysRequest.builder()
                .internetGatewayIds(Arrays.asList("igw-07a03204e0d2e6832"))
                .build();

ec2Client.describeInternetGateways(request);

DescribeInternetGatewaysRequest.builder()
                .maxResults(1000)
                .build();

ec2Client.describeInternetGateways(request);

DescribeVpcsRequest.builder()
                .maxResults(1000)
                .build();

ec2Client.describeVpcs(request);

DescribeVpnGatewaysRequest.builder()

                .build();

ec2Client.describeVpnGateways(request);

DescribeNatGatewaysRequest.builder()

                .build();

ec2Client.describeNatGateways(request);

CreateRouteTableRequest.builder()
                .vpcId("vpc-0ce910c39715c2618")
                .tagSpecifications(Arrays.asList(resourceType("route-table").tags(Arrays.asList(key("Name").value("public-route-table")))))
                .clientToken("4a5b1e2a-c8e8-4f5a-a0a6-73167f583c96")
                .build();

ec2Client.createRouteTable(request);

DescribeInternetGatewaysRequest.builder()
                .maxResults(1000)
                .build();

ec2Client.describeInternetGateways(request);

DescribeRouteTablesRequest.builder()
                .maxResults(100)
                .build();

ec2Client.describeRouteTables(request);

DescribeVpnGatewaysRequest.builder()

                .build();

ec2Client.describeVpnGateways(request);

DescribeSubnetsRequest.builder()
                .maxResults(1000)
                .build();

ec2Client.describeSubnets(request);

DescribeVpcsRequest.builder()
                .maxResults(1000)
                .build();

ec2Client.describeVpcs(request);

DescribeManagedPrefixListsRequest.builder()
                .maxResults(100)
                .build();

ec2Client.describeManagedPrefixLists(request);

DescribeInternetGatewaysRequest.builder()
                .filters(Arrays.asList(name("attachment.vpc-id").values(Arrays.asList("vpc-0ce910c39715c2618"))))
                .build();

ec2Client.describeInternetGateways(request);

CreateRouteRequest.builder()
                .routeTableId("rtb-0c5d4f4e7132694bc")
                .destinationCidrBlock("0.0.0.0/0")
                .gatewayId("igw-07a03204e0d2e6832")
                .build();

ec2Client.createRoute(request);

DescribeInternetGatewaysRequest.builder()
                .filters(Arrays.asList(name("attachment.vpc-id").values(Arrays.asList("vpc-0ce910c39715c2618"))))
                .build();

ec2Client.describeInternetGateways(request);

DescribeRouteTablesRequest.builder()
                .routeTableIds(Arrays.asList("rtb-0c5d4f4e7132694bc"))
                .build();

ec2Client.describeRouteTables(request);

DescribeVpnGatewaysRequest.builder()

                .build();

ec2Client.describeVpnGateways(request);

DescribeNatGatewaysRequest.builder()

                .build();

ec2Client.describeNatGateways(request);

AssociateRouteTableRequest.builder()
                .routeTableId("rtb-0c5d4f4e7132694bc")
                .subnetId("subnet-08d7538ac7b9c4999")
                .build();

ec2Client.associateRouteTable(request);

DescribeRouteTablesRequest.builder()
                .filters(Arrays.asList(name("vpc-id").values(Arrays.asList("vpc-0ce910c39715c2618"))))
                .maxResults(100)
                .build();

ec2Client.describeRouteTables(request);

DescribeSubnetsRequest.builder()
                .filters(Arrays.asList(name("vpc-id").values(Arrays.asList("vpc-0ce910c39715c2618"))))
                .maxResults(1000)
                .build();

ec2Client.describeSubnets(request);

DescribeVpnGatewaysRequest.builder()

                .build();

ec2Client.describeVpnGateways(request);

DescribeNatGatewaysRequest.builder()

                .build();

ec2Client.describeNatGateways(request);

GetResourceShareAssociationsRequest.builder()
                .associationType("RESOURCE")
                .maxResults(1000)
                .build();

ramClient.getResourceShareAssociations(request);

DescribeFlowLogsRequest.builder()
                .maxResults(1000)
                .build();

ec2Client.describeFlowLogs(request);

DescribeNetworkInterfacesRequest.builder()
                .maxResults(1000)
                .build();

ec2Client.describeNetworkInterfaces(request);

DescribeInstancesRequest.builder()
                .maxResults(1000)
                .build();

ec2Client.describeInstances(request);

GetSubnetCidrReservationsRequest.builder()
                .subnetId("subnet-08d7538ac7b9c4999")
                .build();

ec2Client.getSubnetCidrReservations(request);

DescribeCoipPoolsRequest.builder()
                .maxResults(255)
                .build();

ec2Client.describeCoipPools(request);

ModifySubnetAttributeRequest.builder()
                .subnetId("subnet-08d7538ac7b9c4999")
                .mapPublicIpOnLaunch(value(true))
                .build();

ec2Client.modifySubnetAttribute(request);

DescribeSubnetsRequest.builder()
                .subnetIds(Arrays.asList("subnet-08d7538ac7b9c4999"))
                .build();

ec2Client.describeSubnets(request);

DescribeSecurityGroupsRequest.builder()
                .maxResults(1000)
                .build();

ec2Client.describeSecurityGroups(request);

DescribeManagedPrefixListsRequest.builder()
                .maxResults(100)
                .build();

ec2Client.describeManagedPrefixLists(request);

DescribeManagedPrefixListsRequest.builder()
                .maxResults(100)
                .build();

ec2Client.describeManagedPrefixLists(request);

DescribeVpcsRequest.builder()
                .maxResults(1000)
                .build();

ec2Client.describeVpcs(request);

DescribeVpcsRequest.builder()
                .maxResults(1000)
                .build();

ec2Client.describeVpcs(request);

DescribeManagedPrefixListsRequest.builder()
                .maxResults(100)
                .build();

ec2Client.describeManagedPrefixLists(request);

DescribeSecurityGroupsRequest.builder()
                .maxResults(1000)
                .filters(Arrays.asList(name("vpc-id").values(Arrays.asList("vpc-0ce910c39715c2618"))))
                .build();

ec2Client.describeSecurityGroups(request);

DescribeSecurityGroupsRequest.builder()
                .maxResults(1000)
                .filters(Arrays.asList(name("group-name").values(Arrays.asList("public-sg")), name("vpc-id").values(Arrays.asList("vpc-0ce910c39715c2618")), name("owner-id").values(Arrays.asList("408278014231"))))
                .build();

ec2Client.describeSecurityGroups(request);

DescribeSecurityGroupsRequest.builder()
                .maxResults(1000)
                .filters(Arrays.asList(name("group-name").values(Arrays.asList("public-sg")), name("vpc-id").values(Arrays.asList("vpc-0ce910c39715c2618")), name("owner-id").values(Arrays.asList("408278014231"))))
                .build();

ec2Client.describeSecurityGroups(request);

CreateSecurityGroupRequest.builder()
                .groupName("public-sg")
                .description("Allows SSH and HTTP access to EC2 instances in public subnet")
                .vpcId("vpc-0ce910c39715c2618")
                .build();

ec2Client.createSecurityGroup(request);

AuthorizeSecurityGroupIngressRequest.builder()
                .groupId("sg-03d8501cbeef83262")
                .ipPermissions(Arrays.asList(fromPort(22).toPort(22).ipProtocol("tcp").ipRanges(Arrays.asList(cidrIp("157.20.229.97/32"))), fromPort(80).toPort(80).ipProtocol("tcp").ipRanges(Arrays.asList(cidrIp("0.0.0.0/0")))))
                .build();

ec2Client.authorizeSecurityGroupIngress(request);

DescribeSecurityGroupsRequest.builder()
                .groupIds(Arrays.asList("sg-03d8501cbeef83262"))
                .build();

ec2Client.describeSecurityGroups(request);

DescribeVpcsRequest.builder()
                .vpcIds(Arrays.asList("vpc-0ce910c39715c2618"))
                .build();

ec2Client.describeVpcs(request);

DescribeSecurityGroupRulesRequest.builder()
                .maxResults(1000)
                .filters(Arrays.asList(name("group-id").values(Arrays.asList("sg-03d8501cbeef83262"))))
                .build();

ec2Client.describeSecurityGroupRules(request);

DescribeHostsRequest.builder()
                .filter(Arrays.asList())
                .maxResults(500)
                .build();

ec2Client.describeHosts(request);

DescribeAddressesRequest.builder()
                .filters(Arrays.asList())
                .build();

ec2Client.describeAddresses(request);

DescribeInstancesRequest.builder()
                .filters(Arrays.asList())
                .maxResults(1000)
                .build();

ec2Client.describeInstances(request);

DescribeEventsRequest.builder()
                .filter(regions(Arrays.asList("ap-south-1", "global")).services(Arrays.asList("EC2", "MULTIPLE_SERVICES")).eventStatusCodes(Arrays.asList("open")).eventTypeCategories(Arrays.asList("issue")).lastUpdatedTimes(Arrays.asList(from("2025-12-31T11:20:37.856Z"))))
                .maxResults(100)
                .build();

healthClient.describeEvents(request);

DescribeVolumeStatusRequest.builder()
                .maxResults(1000)
                .build();

ec2Client.describeVolumeStatus(request);

DescribeInstanceStatusRequest.builder()
                .maxResults(1000)
                .build();

ec2Client.describeInstanceStatus(request);

DescribeAlarmsRequest.builder()
                .maxRecords(100)
                .stateValue("ALARM")
                .build();

cloudwatchClient.describeAlarms(request);

DescribeLaunchTemplatesRequest.builder()
                .maxResults(1)
                .build();

ec2Client.describeLaunchTemplates(request);

DescribeCapacityReservationsRequest.builder()
                .maxResults(200)
                .build();

ec2Client.describeCapacityReservations(request);

DescribeAutoScalingGroupsRequest.builder()
                .maxRecords(100)
                .build();

autoscalingClient.describeAutoScalingGroups(request);

DescribePlacementGroupsRequest.builder()
                .filters(Arrays.asList())
                .build();

ec2Client.describePlacementGroups(request);

DescribeSecurityGroupsRequest.builder()
                .filter(Arrays.asList())
                .maxResults(1000)
                .build();

ec2Client.describeSecurityGroups(request);

DescribeKeyPairsRequest.builder()
                .filters(Arrays.asList())
                .build();

ec2Client.describeKeyPairs(request);

DescribeVolumesRequest.builder()
                .filter(Arrays.asList())
                .maxResults(1000)
                .build();

ec2Client.describeVolumes(request);

DescribeSnapshotsRequest.builder()
                .filter(Arrays.asList())
                .maxResults(1000)
                .ownerIds(Arrays.asList("408278014231"))
                .build();

ec2Client.describeSnapshots(request);

DescribeAccountAttributesRequest.builder()

                .build();

ec2Client.describeAccountAttributes(request);

DescribeAvailabilityZonesRequest.builder()

                .build();

ec2Client.describeAvailabilityZones(request);

DescribeAlarmsRequest.builder()
                .maxRecords(100)
                .stateValue("OK")
                .build();

cloudwatchClient.describeAlarms(request);

DescribeAlarmsRequest.builder()
                .maxRecords(100)
                .stateValue("INSUFFICIENT_DATA")
                .build();

cloudwatchClient.describeAlarms(request);

DescribeAccountAttributesRequest.builder()

                .build();

ec2Client.describeAccountAttributes(request);

DescribeInstanceTypesRequest.builder()
                .maxResults(100)
                .build();

ec2Client.describeInstanceTypes(request);

DescribeInstanceTypesRequest.builder()
                .maxResults(100)
                .build();

ec2Client.describeInstanceTypes(request);

DescribeTagsRequest.builder()
                .maxResults(1000)
                .filters(Arrays.asList(name("resource-type").values(Arrays.asList("instance"))))
                .build();

ec2Client.describeTags(request);

DescribeInstancesRequest.builder()
                .filters(Arrays.asList(name("instance-state-name").values(Arrays.asList("running"))))
                .maxResults(100)
                .build();

ec2Client.describeInstances(request);

DescribeInstanceTypesRequest.builder()
                .maxResults(100)
                .nextToken("AAIAAQD76z3wIOtvMxxmm_wntJ_DuD8JjjD4o3H-BELWEUnQJ4acDgmq4_lVMZTII4Pf0tz7F6fIX5k7tmCGAxQWejXTeUrGkPdN-WYBr6TK3Zz_JBodf7betmrgMErNxmbJCY4TDm5oko8PtUIc94dKKqqnHxb7Tx4eDAWothmwSKrP-kbR3Rxv_8lMwtEhNqL7CmHVk8SyFRVaW4whzwjR")
                .build();

ec2Client.describeInstanceTypes(request);

DescribeInstanceTypesRequest.builder()
                .maxResults(100)
                .nextToken("AAIAAQdvw2v7Gv6DcAvkFKjsXxVfvFf1VOET7SSUxRhOYBVJLPOip9pyQIiI6V4O45S5vtLpvhW8VmaOEC_M0gHzSzZfbCGz6x2G0BF-VdysiJngSsHGFtbao-6nsuri_f47EkaAOtD0LmTNhBtCjkRcV-1DcdHHhFGlDeLkzTuWpP20q23gHbAu1yH6ryGcYGc9Tf6-cH81fTC2YDpl")
                .build();

ec2Client.describeInstanceTypes(request);

DescribeInstanceTypesRequest.builder()
                .maxResults(100)
                .nextToken("AAIAAQQP0bAxfpXloSHmHN7xH1s_3qa1SetBNoHTdQi5gnQQ7paeShteSoW_U2faTiGUCwBGj60-EG2blQtxEml04F6D7481PNG41P26VRfDaOu7Oxd9L2nNQzqd6oZvxny65eQI1wkI_BccQFgnPoHZsqdmGRTZR50XvH7Mfu9suwpd93YQ3WDBBLDDJmvBqgcTj1qpfTU8EW4I9sisiJNe")
                .build();

ec2Client.describeInstanceTypes(request);

DescribeInstanceTypesRequest.builder()
                .maxResults(100)
                .nextToken("AAIAAYqUlZbdyR6X_XCHFY1ma1ZkWVFNZXd-3wvEL2043ANzJJMw79VwuEXw1WTnbvSI0LxEl9wVYtTwrgMhY8RtZ8YxO0QBqUXW-wx27k8RA_1mQgx6nH8qdu5ji-zR5x_MaTAiEtd5UczZjepU73X2s-TaMEwMSRCA0pNfmAFlSMXIISOl3s6VOwPgcp2A4N_gaHGIwBX5g1u-tQ==")
                .build();

ec2Client.describeInstanceTypes(request);

DescribeInstanceTypesRequest.builder()
                .maxResults(100)
                .nextToken("AAIAAayCs8CHZwsX_OOVTs8FCft0O8_13xSKUQTe4xMKdclIWysf40Ij5jpRla0iMrI72GVv2DjtjoNUUnCqO8C_faK6HEhSIZ7N8gA3ZnLsnBnBqw8nmFzj-09SxspCNg1ZKm9fZM1PSar39CAsUGmU-TimBVO97Rzyxh9N22CEfEKpbUd2zxvLhPBpwAH5qlJU7iU7XtkoAlbSdAEgtvByCQ==")
                .build();

ec2Client.describeInstanceTypes(request);

DescribeInstanceTypesRequest.builder()
                .maxResults(100)
                .nextToken("AAIAAXQ74q4-NkIYJogMdF8yHWQQQZt8QPxNukGRMESV9rOpl0i5pFswfizNeFxFEo22uBLRdtWrvfIf4RSvQgrfzJQmri7O2jIc5sWwuKivT6aa_s6ZG9uwvxDxweT2oM5c6Q3_fDNmDcvOboXecxv0HKEjzNO-a4g3dduHH03fox8TlVS9Tua2bNtYP9NfRBTz-Al0mvP_MpXcHmpGRl221Q==")
                .build();

ec2Client.describeInstanceTypes(request);

DescribeInstancesRequest.builder()
                .maxResults(100)
                .build();

ec2Client.describeInstances(request);

DescribeAvailabilityZonesRequest.builder()

                .build();

ec2Client.describeAvailabilityZones(request);

DescribeInstanceTypesRequest.builder()
                .instanceTypes(Arrays.asList("t2.2xlarge", "t2.large", "t2.medium", "t2.micro", "t2.nano", "t2.small", "t2.xlarge", "t3.2xlarge", "t3.large", "t3.medium", "t3.micro", "t3.nano", "t3.small", "t3.xlarge", "t4g.2xlarge", "t4g.large", "t4g.medium", "t4g.micro", "t4g.nano", "t4g.small", "t4g.xlarge"))
                .build();

ec2Client.describeInstanceTypes(request);

DescribeSecurityGroupsRequest.builder()
                .maxResults(1000)
                .build();

ec2Client.describeSecurityGroups(request);

DescribeSubnetsRequest.builder()
                .maxResults(200)
                .build();

ec2Client.describeSubnets(request);

DescribeVpcsRequest.builder()
                .maxResults(200)
                .build();

ec2Client.describeVpcs(request);

DescribeInstanceTypeOfferingsRequest.builder()
                .maxResults(1000)
                .locationType("availability-zone")
                .build();

ec2Client.describeInstanceTypeOfferings(request);

DescribeInstanceTypesRequest.builder()
                .maxResults(100)
                .build();

ec2Client.describeInstanceTypes(request);

DescribeImagesRequest.builder()
                .maxResults(5)
                .filters(Arrays.asList(name("is-public").values(Arrays.asList("false"))))
                .build();

ec2Client.describeImages(request);

DescribeVpcsRequest.builder()

                .build();

ec2Client.describeVpcs(request);

GetEbsEncryptionByDefaultRequest.builder()

                .build();

ec2Client.getEbsEncryptionByDefault(request);

GetAllowedImagesSettingsRequest.builder()

                .build();

ec2Client.getAllowedImagesSettings(request);

DescribeImagesRequest.builder()
                .maxResults(5)
                .owners(Arrays.asList("self"))
                .build();

ec2Client.describeImages(request);

DescribeInstanceTypeOfferingsRequest.builder()
                .maxResults(1000)
                .nextToken("AAIAAblUAflYbS_gb_j2S9IaTbif5dQOZ6q3QU2Lqw_uwz1vw1JsG6bgzUZgMamKFpf2JCj3lkY03NbsiX0814-DrbDcPM6dIasDkCwZayFcM9dNA75KdSb_ifS2nvVzs9OpdH_giNqgBiyzXa9VfwZlUPrnyeZJI75N-hKwiNsHrxx5fLqNrWU2K6zFoNk9eek1rN256VdxxWoKjX0dkg==")
                .locationType("availability-zone")
                .build();

ec2Client.describeInstanceTypeOfferings(request);

DescribeInstanceTypesRequest.builder()
                .maxResults(100)
                .nextToken("AAIAAVOv4xRfB3gz7-xT4VHa37i3ZYlBs23ap8qHAkE-Qogh6liUUj_z3wTG9eMwXf_v7sRiYOksFKaT7uAYLQ4D2yw7L9YEz14lvo9aDAzBBo8uhSzd__5zYBm_DqSUZY4LLwI1glAQJD-O6X5ZV9ij91RIjorHRBtyoO1e4JIgZktQDyhCJLVJdN8lNWj20ekj5gjXM1YTGfmdBf9xO8qa")
                .build();

ec2Client.describeInstanceTypes(request);

GetEbsDefaultKmsKeyIdRequest.builder()

                .build();

ec2Client.getEbsDefaultKmsKeyId(request);

DescribeInstancesRequest.builder()
                .filters(Arrays.asList(name("instance-state-name").values(Arrays.asList("running"))))
                .maxResults(5)
                .build();

ec2Client.describeInstances(request);

DescribeImagesRequest.builder()
                .imageIds(Arrays.asList("ami-00ca570c1b6d79f36"))
                .build();

ec2Client.describeImages(request);

GetDefaultCreditSpecificationRequest.builder()
                .instanceFamily("t3")
                .build();

ec2Client.getDefaultCreditSpecification(request);

DescribeInstanceTypesRequest.builder()
                .maxResults(100)
                .nextToken("AAIAAblrNt03ndzSGOoWJXoLaj5-57OIgcrAGlombYXhwUJhUn1RVogTPHSGV8NKq8O9tpHMiZsG-Hd8pYDEBknjqU0ugWk6TTC3_7NkbvWlMwmnFqmO96pkRJJ9MxmjCMr0hIyWe26ZTPkd9tLDnAQWmtUDsgTZAH156t_JqUCi5jZioBxyLP-L32xuXWuhZM-swuCs2KYO6eAE44sD")
                .build();

ec2Client.describeInstanceTypes(request);

GetInstanceMetadataDefaultsRequest.builder()

                .build();

ec2Client.getInstanceMetadataDefaults(request);

DescribeSnapshotsRequest.builder()
                .snapshotIds(Arrays.asList("snap-01458e3708621fd87"))
                .build();

ec2Client.describeSnapshots(request);

DescribeInstanceTypesRequest.builder()
                .maxResults(100)
                .nextToken("AAIAAfrPnZD6dl1H5Sm6EyNGL-LM-vudhhuUaXhmtUd4dO4NcZhuTFujjWMcv6aMHNKYzbQYXvboAVq2K26Jqj2JXegsuqa7M_6Ng7sJz1SRrDOvvWO_dTo2CD7Rkfg9F6NC976yNvGd6vaz5AsMPQWOXonb3-_EZmOmD_8ybSa4DwDJTNYo278Xs33Z1ziADnh6BuD0eqlRB3b3bVcmvEU9")
                .build();

ec2Client.describeInstanceTypes(request);

DescribeInstanceTypesRequest.builder()
                .maxResults(100)
                .nextToken("AAIAAX8LMiegx3_XByJGCtX_ghAhIyhX2L7rZiIeQ-xYtPWYski9h5oXmmM1xfNcyEcRbIk1GCQFhxmub-1UtjuxoYZhroxZn7ibpRUHuXwhC4N8nCfSHOmE4VCXEx7gvN76QNQ8_6GQt6KRpSJ7xZXi_HkwtI-5rBqhPmMrX871FA-E9LpP5u99cnpXeGkG6KYRmSPJ1R8MyduxVQ==")
                .build();

ec2Client.describeInstanceTypes(request);

DescribeInstanceTypesRequest.builder()
                .maxResults(100)
                .nextToken("AAIAATf7H2aSccdzHQGBIBXZ3-QQfz-vmL-nLlxXMfAfPcyxLYl48Ueiueg-1FQb3DAf_l9j-W0lH6p63fCk4V2RltRd0W-vscAjXKoqmvRt2VDzFk3yZB_bfRfIp53wQiD8AwwslvxpsVoQHP7DpMPD_gPiB2ttFZuL6s-C6eNmZlTVlmLLLjTLhFlMKT91yzb5ehW8f1nDKPTsCZRp1I9b0A==")
                .build();

ec2Client.describeInstanceTypes(request);

DescribeInstanceTypesRequest.builder()
                .maxResults(100)
                .nextToken("AAIAAURLvGeh3TFVMSfoayjY7SbYlplEafwSl_DVzOIa0loNfdf2xCyXC8E4KJOY6JAF1H-0r21Di_hx_42den90OnGVTkbZWiZK8d73L55FQHXaxHViIHpa3JL_orMtEJmnoFrCd-RkOj9gA177jf3BJdg9OARI8sdJ_9b3kne8HAN1NCXc2gbs47M_b3euHY1xEwMzgLHTbJwg1ndvv8QPsA==")
                .build();

ec2Client.describeInstanceTypes(request);

DescribeImagesRequest.builder()
                .imageIds(Arrays.asList("ami-02b8269d5e85954ef"))
                .build();

ec2Client.describeImages(request);

DescribeSnapshotsRequest.builder()
                .snapshotIds(Arrays.asList("snap-02aec5d73c95cb35b"))
                .build();

ec2Client.describeSnapshots(request);

DescribeKeyPairsRequest.builder()

                .build();

ec2Client.describeKeyPairs(request);

CreateKeyPairRequest.builder()
                .keyName("public-ec2-key")
                .keyType("rsa")
                .keyFormat("pem")
                .build();

ec2Client.createKeyPair(request);

DescribeKeyPairsRequest.builder()

                .build();

ec2Client.describeKeyPairs(request);

GetSecurityGroupsForVpcRequest.builder()
                .vpcId("vpc-0ce910c39715c2618")
                .build();

ec2Client.getSecurityGroupsForVpc(request);

GetSecurityGroupsForVpcRequest.builder()
                .vpcId("vpc-0ce910c39715c2618")
                .maxResults(200)
                .build();

ec2Client.getSecurityGroupsForVpc(request);

GetSecurityGroupsForVpcRequest.builder()
                .vpcId("vpc-0ce910c39715c2618")
                .maxResults(200)
                .build();

ec2Client.getSecurityGroupsForVpc(request);

RunInstancesRequest.builder()
                .maxCount(1)
                .minCount(1)
                .imageId("ami-02b8269d5e85954ef")
                .instanceType("t3.micro")
                .keyName("public-ec2-key")
                .ebsOptimized(true)
                .blockDeviceMappings(Arrays.asList(deviceName("/dev/sda1").ebs(encrypted(false).deleteOnTermination(true).iops(3000).snapshotId("snap-02aec5d73c95cb35b").volumeSize(8).volumeType("gp3").throughput(125))))
                .networkInterfaces(Arrays.asList(subnetId("subnet-08d7538ac7b9c4999").associatePublicIpAddress(true).deviceIndex(0).groups(Arrays.asList("sg-03d8501cbeef83262"))))
                .creditSpecification(cpuCredits("unlimited"))
                .tagSpecifications(Arrays.asList(resourceType("instance").tags(Arrays.asList(key("Name").value("ec2-public-1a")))))
                .metadataOptions(httpEndpoint("enabled").httpPutResponseHopLimit(2).httpTokens("required"))
                .privateDnsNameOptions(hostnameType("ip-name").enableResourceNameDnsARecord(false).enableResourceNameDnsAAAARecord(false))
                .build();

ec2Client.runInstances(request);

DescribeInstancesRequest.builder()
                .maxResults(100)
                .filters(Arrays.asList())
                .build();

ec2Client.describeInstances(request);

DescribeInstancesRequest.builder()
                .filters(Arrays.asList(name("instance-state-name").values(Arrays.asList("running"))))
                .maxResults(100)
                .build();

ec2Client.describeInstances(request);

DescribeInstanceStatusRequest.builder()
                .instanceIds(Arrays.asList("i-0e11209467d4fe4f0"))
                .build();

ec2Client.describeInstanceStatus(request);

DescribeRegionsRequest.builder()
                .allRegions(true)
                .build();

ec2Client.describeRegions(request);

DescribeDhcpOptionsRequest.builder()
                .maxResults(1000)
                .build();

ec2Client.describeDhcpOptions(request);

DescribeVpcBlockPublicAccessOptionsRequest.builder()

                .build();

ec2Client.describeVpcBlockPublicAccessOptions(request);

DescribeAccountAttributesRequest.builder()
                .attributeNames(Arrays.asList("supported-platforms"))
                .build();

ec2Client.describeAccountAttributes(request);

DescribeInternetGatewaysRequest.builder()
                .maxResults(1000)
                .build();

ec2Client.describeInternetGateways(request);

DescribeVpcsRequest.builder()
                .maxResults(1000)
                .build();

ec2Client.describeVpcs(request);

DescribeRouteTablesRequest.builder()
                .maxResults(100)
                .build();

ec2Client.describeRouteTables(request);

DescribeSubnetsRequest.builder()
                .maxResults(1000)
                .build();

ec2Client.describeSubnets(request);

DescribeEgressOnlyInternetGatewaysRequest.builder()
                .maxResults(255)
                .build();

ec2Client.describeEgressOnlyInternetGateways(request);

DescribeAddressesRequest.builder()

                .build();

ec2Client.describeAddresses(request);

DescribeVpcEndpointsRequest.builder()
                .maxResults(1000)
                .build();

ec2Client.describeVpcEndpoints(request);

DescribeInstanceConnectEndpointsRequest.builder()
                .maxResults(50)
                .build();

ec2Client.describeInstanceConnectEndpoints(request);

DescribeVpcEndpointServiceConfigurationsRequest.builder()
                .maxResults(1000)
                .build();

ec2Client.describeVpcEndpointServiceConfigurations(request);

DescribeNatGatewaysRequest.builder()
                .maxResults(1000)
                .build();

ec2Client.describeNatGateways(request);

DescribeVpcPeeringConnectionsRequest.builder()
                .maxResults(1000)
                .build();

ec2Client.describeVpcPeeringConnections(request);

DescribeNetworkAclsRequest.builder()
                .maxResults(1000)
                .build();

ec2Client.describeNetworkAcls(request);

DescribeSecurityGroupsRequest.builder()
                .maxResults(1000)
                .build();

ec2Client.describeSecurityGroups(request);

DescribeCustomerGatewaysRequest.builder()

                .build();

ec2Client.describeCustomerGateways(request);

DescribeVpnGatewaysRequest.builder()

                .build();

ec2Client.describeVpnGateways(request);

DescribeVpnConnectionsRequest.builder()

                .build();

ec2Client.describeVpnConnections(request);

DescribeInstancesRequest.builder()
                .maxResults(1000)
                .filters(Arrays.asList(name("instance-state-name").values(Arrays.asList("running"))))
                .build();

ec2Client.describeInstances(request);

DescribeNetworkAclsRequest.builder()
                .maxResults(1000)
                .build();

ec2Client.describeNetworkAcls(request);

DescribeAccountAttributesRequest.builder()
                .attributeNames(Arrays.asList("default-vpc", "supported-platforms"))
                .build();

ec2Client.describeAccountAttributes(request);

DescribeInternetGatewaysRequest.builder()
                .filters(Arrays.asList(name("attachment.vpc-id").values(Arrays.asList("vpc-0ce910c39715c2618"))))
                .build();

ec2Client.describeInternetGateways(request);

DescribeNetworkAclsRequest.builder()
                .maxResults(1000)
                .filters(Arrays.asList(name("vpc-id").values(Arrays.asList("vpc-0ce910c39715c2618")), name("default").values(Arrays.asList("true"))))
                .build();

ec2Client.describeNetworkAcls(request);

ListFirewallRuleGroupAssociationsRequest.builder()
                .vpcId("vpc-0ce910c39715c2618")
                .maxResults(100)
                .build();

route53resolverClient.listFirewallRuleGroupAssociations(request);

DescribeNatGatewaysRequest.builder()

                .build();

ec2Client.describeNatGateways(request);

DescribeEgressOnlyInternetGatewaysRequest.builder()

                .build();

ec2Client.describeEgressOnlyInternetGateways(request);

DescribeRouteTablesRequest.builder()
                .filters(Arrays.asList(name("vpc-id").values(Arrays.asList("vpc-0ce910c39715c2618")), name("association.main").values(Arrays.asList("true"))))
                .build();

ec2Client.describeRouteTables(request);

DescribeVpcAttributeRequest.builder()
                .vpcId("vpc-0ce910c39715c2618")
                .attribute("enableNetworkAddressUsageMetrics")
                .build();

ec2Client.describeVpcAttribute(request);

DescribeVpcAttributeRequest.builder()
                .vpcId("vpc-0ce910c39715c2618")
                .attribute("enableDnsHostnames")
                .build();

ec2Client.describeVpcAttribute(request);

DescribeVpcAttributeRequest.builder()
                .vpcId("vpc-0ce910c39715c2618")
                .attribute("enableDnsSupport")
                .build();

ec2Client.describeVpcAttribute(request);

DescribeInternetGatewaysRequest.builder()
                .filters(Arrays.asList(name("attachment.vpc-id").values(Arrays.asList("vpc-0ce910c39715c2618"))))
                .build();

ec2Client.describeInternetGateways(request);

DescribeVpcsRequest.builder()
                .vpcIds(Arrays.asList("vpc-0ce910c39715c2618"))
                .build();

ec2Client.describeVpcs(request);

DescribeSubnetsRequest.builder()
                .filters(Arrays.asList(name("vpc-id").values(Arrays.asList("vpc-0ce910c39715c2618"))))
                .build();

ec2Client.describeSubnets(request);

DescribeRouteTablesRequest.builder()
                .filters(Arrays.asList(name("vpc-id").values(Arrays.asList("vpc-0ce910c39715c2618"))))
                .maxResults(100)
                .build();

ec2Client.describeRouteTables(request);

DescribeEgressOnlyInternetGatewaysRequest.builder()

                .build();

ec2Client.describeEgressOnlyInternetGateways(request);

DescribeNatGatewaysRequest.builder()
                .filter(Arrays.asList(name("vpc-id").values(Arrays.asList("vpc-0ce910c39715c2618"))))
                .build();

ec2Client.describeNatGateways(request);

DescribeVpcEndpointsRequest.builder()
                .filters(Arrays.asList(name("vpc-id").values(Arrays.asList("vpc-0ce910c39715c2618"))))
                .build();

ec2Client.describeVpcEndpoints(request);

DescribeVpcsRequest.builder()
                .vpcIds(Arrays.asList("vpc-0ce910c39715c2618"))
                .build();

ec2Client.describeVpcs(request);

DescribeSubnetsRequest.builder()
                .filters(Arrays.asList(name("vpc-id").values(Arrays.asList("vpc-0ce910c39715c2618"))))
                .build();

ec2Client.describeSubnets(request);

DescribeRouteTablesRequest.builder()
                .filters(Arrays.asList(name("vpc-id").values(Arrays.asList("vpc-0ce910c39715c2618"))))
                .maxResults(100)
                .build();

ec2Client.describeRouteTables(request);

DescribeEgressOnlyInternetGatewaysRequest.builder()

                .build();

ec2Client.describeEgressOnlyInternetGateways(request);

DescribeNatGatewaysRequest.builder()
                .filter(Arrays.asList(name("vpc-id").values(Arrays.asList("vpc-0ce910c39715c2618"))))
                .build();

ec2Client.describeNatGateways(request);

DescribeVpcEndpointsRequest.builder()
                .filters(Arrays.asList(name("vpc-id").values(Arrays.asList("vpc-0ce910c39715c2618"))))
                .build();

ec2Client.describeVpcEndpoints(request);

DescribeFlowLogsRequest.builder()
                .maxResults(1000)
                .build();

ec2Client.describeFlowLogs(request);

DescribeNetworkAclsRequest.builder()
                .maxResults(1000)
                .build();

ec2Client.describeNetworkAcls(request);

DescribeNetworkAclsRequest.builder()
                .maxResults(1000)
                .build();

ec2Client.describeNetworkAcls(request);

DescribeSubnetsRequest.builder()
                .maxResults(1000)
                .build();

ec2Client.describeSubnets(request);

DescribeVpcsRequest.builder()
                .maxResults(1000)
                .build();

ec2Client.describeVpcs(request);

DescribeInstanceTypeOfferingsRequest.builder()
                .locationType("availability-zone")
                .build();

ec2Client.describeInstanceTypeOfferings(request);

DescribeInstanceTypesRequest.builder()
                .filters(Arrays.asList())
                .maxResults(100)
                .build();

ec2Client.describeInstanceTypes(request);

DescribeInstanceTypeOfferingsRequest.builder()
                .locationType("availability-zone")
                .nextToken("AAIAAe38IfemBn4UlZ_yfO2450g4ErAc3issNu7CL7WwF9ADvfO094qvWWS21Bobnu_rDNlRgRR740Rsg8xY53qkaJEgT8AWGRovy3Cby7n8ENqpdCu8J1STygVQfukRmkw73npezOjdSFkLu-HgEwwqQUZ9-amaqCNT9P7qH9lMaI0_lgMUPGnQEGHXCuQaUKfLbAXjUmI3SQyEN2negw==")
                .build();

ec2Client.describeInstanceTypeOfferings(request);

DescribeAutoScalingGroupsRequest.builder()
                .maxRecords(100)
                .build();

autoscalingClient.describeAutoScalingGroups(request);

DescribePlacementGroupsRequest.builder()
                .filters(Arrays.asList())
                .build();

ec2Client.describePlacementGroups(request);

DescribeSecurityGroupsRequest.builder()
                .filter(Arrays.asList())
                .maxResults(1000)
                .build();

ec2Client.describeSecurityGroups(request);

DescribeKeyPairsRequest.builder()
                .filters(Arrays.asList())
                .build();

ec2Client.describeKeyPairs(request);

DescribeVolumesRequest.builder()
                .filter(Arrays.asList())
                .maxResults(1000)
                .build();

ec2Client.describeVolumes(request);

DescribeSnapshotsRequest.builder()
                .filter(Arrays.asList())
                .maxResults(1000)
                .ownerIds(Arrays.asList("408278014231"))
                .build();

ec2Client.describeSnapshots(request);

DescribeHostsRequest.builder()
                .filter(Arrays.asList())
                .maxResults(500)
                .build();

ec2Client.describeHosts(request);

DescribeAddressesRequest.builder()
                .filters(Arrays.asList())
                .build();

ec2Client.describeAddresses(request);

DescribeInstancesRequest.builder()
                .filters(Arrays.asList())
                .maxResults(1000)
                .build();

ec2Client.describeInstances(request);

DescribeAccountAttributesRequest.builder()

                .build();

ec2Client.describeAccountAttributes(request);

DescribeAvailabilityZonesRequest.builder()

                .build();

ec2Client.describeAvailabilityZones(request);

DescribeEventsRequest.builder()
                .filter(regions(Arrays.asList("ap-south-1", "global")).services(Arrays.asList("EC2", "MULTIPLE_SERVICES")).eventStatusCodes(Arrays.asList("open")).eventTypeCategories(Arrays.asList("issue")).lastUpdatedTimes(Arrays.asList(from("2025-12-31T11:30:59.577Z"))))
                .maxResults(100)
                .build();

healthClient.describeEvents(request);

DescribeVolumeStatusRequest.builder()
                .maxResults(1000)
                .build();

ec2Client.describeVolumeStatus(request);

DescribeInstanceStatusRequest.builder()
                .maxResults(1000)
                .build();

ec2Client.describeInstanceStatus(request);

DescribeAlarmsRequest.builder()
                .maxRecords(100)
                .stateValue("ALARM")
                .build();

cloudwatchClient.describeAlarms(request);

DescribeLaunchTemplatesRequest.builder()
                .maxResults(1)
                .build();

ec2Client.describeLaunchTemplates(request);

DescribeCapacityReservationsRequest.builder()
                .maxResults(200)
                .build();

ec2Client.describeCapacityReservations(request);

DescribeAlarmsRequest.builder()
                .maxRecords(100)
                .stateValue("OK")
                .build();

cloudwatchClient.describeAlarms(request);

DescribeAlarmsRequest.builder()
                .maxRecords(100)
                .stateValue("INSUFFICIENT_DATA")
                .build();

cloudwatchClient.describeAlarms(request);

DescribeTagsRequest.builder()
                .maxResults(1000)
                .filters(Arrays.asList(name("resource-type").values(Arrays.asList("instance"))))
                .build();

ec2Client.describeTags(request);

DescribeAccountAttributesRequest.builder()

                .build();

ec2Client.describeAccountAttributes(request);

DescribeInstanceTypesRequest.builder()
                .maxResults(100)
                .build();

ec2Client.describeInstanceTypes(request);

DescribeInstanceTypesRequest.builder()
                .maxResults(100)
                .build();

ec2Client.describeInstanceTypes(request);

DescribeInstancesRequest.builder()
                .filters(Arrays.asList(name("instance-state-name").values(Arrays.asList("running"))))
                .maxResults(100)
                .build();

ec2Client.describeInstances(request);

DescribeInstanceStatusRequest.builder()
                .instanceIds(Arrays.asList("i-0e11209467d4fe4f0"))
                .build();

ec2Client.describeInstanceStatus(request);

DescribeInstanceTypesRequest.builder()
                .maxResults(100)
                .nextToken("AAIAAf_OY7orPgeSi-8bMggEPm60ScpYN_eoEteZa0cmo1cL2y-CFfmlkqi1oJrfSH5qgd-rkmVaqfb6Yuwglf6vWcm9fdkglClc1F4_dsa6w8sB7OW1mGBYw1QGRptVrXrI-bLRpm_0bAMBh7Da9-B3s4dahv-6wHjH1db15_LXEw-43PdGR-07vhXnXDXk3VnkdX7iHxszCwj1oiOpw1al")
                .build();

ec2Client.describeInstanceTypes(request);

DescribeInstanceTypesRequest.builder()
                .maxResults(100)
                .nextToken("AAIAAeWoq_c2STQ0uaAB5LAz-ag5PspcLocY5eGNXx_Rrm84B5URGqXUKcf2hhw0MzEulwOfa6QMFONkHVcBTT-NLcwvII1ajGUs1ivnIliFGJRe2jbIyHBZkLx1d0QpKAYtxVspTSkmH60Ep8l5diPW4213RApreSVt843itLv0xZV1FcpCET3vqDOWlqJNqJy8bFc_lfpSSrdVahbM")
                .build();

ec2Client.describeInstanceTypes(request);

DescribeInstanceTypesRequest.builder()
                .maxResults(100)
                .nextToken("AAIAAevAxWIVpT4I6rU7q7K82kph4n2-Hwd1N9908cGy7PVIEqFjYHaobeZ1urBnjcu6RXKTJQLxVBUPIfzfRSx34iZd2ON0z_1sipleXhWLRMePyv1gPrFIkfFo5rpgTMQZEdUdgNvYv28Q_ujOtR9qGBqdE6lcps5hmaFpHM-Nr7BqDcf7eWHggKpX4-TJa917Nd557WH54GygBzCfm8cf")
                .build();

ec2Client.describeInstanceTypes(request);

DescribeInstanceTypesRequest.builder()
                .maxResults(100)
                .nextToken("AAIAAUsKTRIQ-zvxnrcipoczXrBiogT9SLAz_ma_Cp1w6alRzld6qjh8TdUrYAkkRXB0hXgHqN111xwLslkPgko74HK6E4rI4CM2pXM1ceNRzUHmGUetjG68VPSUNmy_2iQpxmQwMLEGWdIqTI-EQk1_cjfyZVVJymYSA_jToekZ8cZOlABF1UlrA6eB--SkNr61T0dpX3HnGkGvnw==")
                .build();

ec2Client.describeInstanceTypes(request);

DescribeInstanceTypesRequest.builder()
                .maxResults(100)
                .nextToken("AAIAAVq2kCp3N2EU2LMzQdCbP9E1pDrqKMLn4h7gLWVn8nYUxg88jajCNGWTHp8Ldw8ICt1zPewDJfexrQXvPrsd2Rwqxmm6JMPP_GNkxGGfZ1G2Mp8yu91L3ctB0hZb6ts_vd3OnFpx1v46hbTIP3IJ_VEQJrBd_aG0feJan4p_AvL7FqcMxcOFL5bHmTL-TaFMq2XIGhyiym2KksVJmSYmNQ==")
                .build();

ec2Client.describeInstanceTypes(request);

DescribeInstanceTypesRequest.builder()
                .maxResults(100)
                .nextToken("AAIAAV9ld7xpczBijOE9TrnU7YQ1EY87ZkrbiAnV1X1UQCGxgpzFumw-QFFl3ogSrG7kwE_LfdaVyva6qwkqs2nS24GPxOI7wIhB283rEOlxGclvcUN0i5B2EqywYXWoCrwBae47bzgM1d0jmkb6U2o4TOmY6qNjn4OWLqgaHEE4H1avYHLq6HxKsVlcMVfepcdpdAXi4YIFUwr7ucrpqZfOlw==")
                .build();

ec2Client.describeInstanceTypes(request);

DescribeNetworkInterfacesRequest.builder()
                .filters(Arrays.asList(name("attachment.instance-id").values(Arrays.asList("i-0e11209467d4fe4f0"))))
                .build();

ec2Client.describeNetworkInterfaces(request);

DescribeInstanceCreditSpecificationsRequest.builder()
                .instanceIds(Arrays.asList("i-0e11209467d4fe4f0"))
                .build();

ec2Client.describeInstanceCreditSpecifications(request);

DescribeInstanceAttributeRequest.builder()
                .instanceId("i-0e11209467d4fe4f0")
                .attribute("disableApiStop")
                .build();

ec2Client.describeInstanceAttribute(request);

DescribeInstanceAttributeRequest.builder()
                .instanceId("i-0e11209467d4fe4f0")
                .attribute("disableApiTermination")
                .build();

ec2Client.describeInstanceAttribute(request);

DescribeNetworkInterfacesRequest.builder()
                .filters(Arrays.asList(name("attachment.instance-id").values(Arrays.asList("i-0e11209467d4fe4f0"))))
                .build();

ec2Client.describeNetworkInterfaces(request);

DescribeAddressesRequest.builder()
                .filters(Arrays.asList(name("instance-id").values(Arrays.asList("i-0e11209467d4fe4f0"))))
                .build();

ec2Client.describeAddresses(request);

DescribeInstancesRequest.builder()
                .instanceIds(Arrays.asList("i-0e11209467d4fe4f0"))
                .build();

ec2Client.describeInstances(request);

DescribeReplaceRootVolumeTasksRequest.builder()
                .filters(Arrays.asList(name("instance-id").values(Arrays.asList("i-0e11209467d4fe4f0"))))
                .maxResults(50)
                .build();

ec2Client.describeReplaceRootVolumeTasks(request);

DescribeVolumesRequest.builder()
                .volumeIds(Arrays.asList("vol-068ef5c6e36f025a3"))
                .build();

ec2Client.describeVolumes(request);

DescribeInstanceImageMetadataRequest.builder()
                .instanceIds(Arrays.asList("i-0e11209467d4fe4f0"))
                .build();

ec2Client.describeInstanceImageMetadata(request);

DescribeEventsRequest.builder()
                .filter(services(Arrays.asList("EC2")).entityValues(Arrays.asList("i-0e11209467d4fe4f0")).eventTypeCodes(Arrays.asList("AWS_EC2_SIMPLIFIED_AUTO_RECOVERY_SUCCESS", "AWS_EC2_INSTANCE_AUTO_RECOVERY_SUCCESS", "AWS_EC2_SIMPLIFIED_AUTO_RECOVERY_FAILURE", "AWS_EC2_INSTANCE_AUTO_RECOVERY_FAILURE")).startTimes(Arrays.asList(from("2026-01-03T11:31:17.444Z"))))
                .build();

healthClient.describeEvents(request);

GetEnrollmentStatusRequest.builder()

                .build();

compute-optimizerClient.getEnrollmentStatus(request);

DescribeInstanceInformationRequest.builder()
                .filters(Arrays.asList(key("InstanceIds").values(Arrays.asList("i-0e11209467d4fe4f0"))))
                .build();

ssmClient.describeInstanceInformation(request);

DescribeInstanceStatusRequest.builder()
                .instanceIds(Arrays.asList("i-0e11209467d4fe4f0"))
                .build();

ec2Client.describeInstanceStatus(request);

DescribeVpcsRequest.builder()
                .vpcIds(Arrays.asList("vpc-0ce910c39715c2618"))
                .build();

ec2Client.describeVpcs(request);

DescribeSubnetsRequest.builder()
                .subnetIds(Arrays.asList("subnet-08d7538ac7b9c4999"))
                .build();

ec2Client.describeSubnets(request);

DescribeImagesRequest.builder()
                .imageIds(Arrays.asList("ami-02b8269d5e85954ef"))
                .build();

ec2Client.describeImages(request);

GetEnrollmentStatusRequest.builder()

                .build();

compute-optimizerClient.getEnrollmentStatus(request);

GetEnrollmentStatusRequest.builder()

                .build();

compute-optimizerClient.getEnrollmentStatus(request);

DescribeSecurityGroupRulesRequest.builder()
                .filters(Arrays.asList(name("group-id").values(Arrays.asList("sg-03d8501cbeef83262"))))
                .maxResults(1000)
                .build();

ec2Client.describeSecurityGroupRules(request);

DescribeSecurityGroupsRequest.builder()
                .groupIds(Arrays.asList("sg-03d8501cbeef83262"))
                .build();

ec2Client.describeSecurityGroups(request);

DescribeAlarmsForMetricRequest.builder()
                .metricName("InstanceEBSIOPSExceededCheck")
                .namespace("AWS/EC2")
                .dimensions(Arrays.asList(name("InstanceId").value("i-0e11209467d4fe4f0")))
                .build();

cloudwatchClient.describeAlarmsForMetric(request);

DescribeAlarmsForMetricRequest.builder()
                .metricName("InstanceEBSThroughputExceededCheck")
                .namespace("AWS/EC2")
                .dimensions(Arrays.asList(name("InstanceId").value("i-0e11209467d4fe4f0")))
                .build();

cloudwatchClient.describeAlarmsForMetric(request);

DescribeAlarmsForMetricRequest.builder()
                .metricName("VolumeAvgThroughput")
                .namespace("AWS/EBS")
                .dimensions(Arrays.asList(name("VolumeId").value("vol-068ef5c6e36f025a3"), name("InstanceId").value("i-0e11209467d4fe4f0")))
                .build();

cloudwatchClient.describeAlarmsForMetric(request);

GetEnrollmentStatusRequest.builder()

                .build();

compute-optimizerClient.getEnrollmentStatus(request);

DescribeAlarmsForMetricRequest.builder()
                .metricName("VolumeStalledIOCheck")
                .namespace("AWS/EBS")
                .dimensions(Arrays.asList(name("VolumeId").value("vol-068ef5c6e36f025a3"), name("InstanceId").value("i-0e11209467d4fe4f0")))
                .build();

cloudwatchClient.describeAlarmsForMetric(request);

DescribeAlarmsForMetricRequest.builder()
                .metricName("VolumeIOPSExceededCheck")
                .namespace("AWS/EBS")
                .dimensions(Arrays.asList(name("VolumeId").value("vol-068ef5c6e36f025a3"), name("InstanceId").value("i-0e11209467d4fe4f0")))
                .build();

cloudwatchClient.describeAlarmsForMetric(request);

DescribeAlarmsForMetricRequest.builder()
                .metricName("VolumeAvgWriteLatency")
                .namespace("AWS/EBS")
                .dimensions(Arrays.asList(name("VolumeId").value("vol-068ef5c6e36f025a3"), name("InstanceId").value("i-0e11209467d4fe4f0")))
                .build();

cloudwatchClient.describeAlarmsForMetric(request);

DescribeAlarmsForMetricRequest.builder()
                .metricName("VolumeAvgIOPS")
                .namespace("AWS/EBS")
                .dimensions(Arrays.asList(name("VolumeId").value("vol-068ef5c6e36f025a3"), name("InstanceId").value("i-0e11209467d4fe4f0")))
                .build();

cloudwatchClient.describeAlarmsForMetric(request);

DescribeAlarmsForMetricRequest.builder()
                .metricName("VolumeThroughputExceededCheck")
                .namespace("AWS/EBS")
                .dimensions(Arrays.asList(name("VolumeId").value("vol-068ef5c6e36f025a3"), name("InstanceId").value("i-0e11209467d4fe4f0")))
                .build();

cloudwatchClient.describeAlarmsForMetric(request);

DescribeAlarmsForMetricRequest.builder()
                .metricName("VolumeAvgReadLatency")
                .namespace("AWS/EBS")
                .dimensions(Arrays.asList(name("VolumeId").value("vol-068ef5c6e36f025a3"), name("InstanceId").value("i-0e11209467d4fe4f0")))
                .build();

cloudwatchClient.describeAlarmsForMetric(request);

DescribeAlarmsForMetricRequest.builder()
                .metricName("NetworkIn")
                .namespace("AWS/EC2")
                .dimensions(Arrays.asList(name("InstanceId").value("i-0e11209467d4fe4f0")))
                .build();

cloudwatchClient.describeAlarmsForMetric(request);

DescribeAlarmsForMetricRequest.builder()
                .metricName("NetworkPacketsIn")
                .namespace("AWS/EC2")
                .dimensions(Arrays.asList(name("InstanceId").value("i-0e11209467d4fe4f0")))
                .build();

cloudwatchClient.describeAlarmsForMetric(request);

DescribeAlarmsForMetricRequest.builder()
                .metricName("NetworkOut")
                .namespace("AWS/EC2")
                .dimensions(Arrays.asList(name("InstanceId").value("i-0e11209467d4fe4f0")))
                .build();

cloudwatchClient.describeAlarmsForMetric(request);

DescribeAlarmsForMetricRequest.builder()
                .metricName("NetworkPacketsOut")
                .namespace("AWS/EC2")
                .dimensions(Arrays.asList(name("InstanceId").value("i-0e11209467d4fe4f0")))
                .build();

cloudwatchClient.describeAlarmsForMetric(request);

DescribeAlarmsForMetricRequest.builder()
                .metricName("MetadataNoToken")
                .namespace("AWS/EC2")
                .dimensions(Arrays.asList(name("InstanceId").value("i-0e11209467d4fe4f0")))
                .build();

cloudwatchClient.describeAlarmsForMetric(request);

DescribeAlarmsForMetricRequest.builder()
                .metricName("CPUSurplusCreditBalance")
                .namespace("AWS/EC2")
                .dimensions(Arrays.asList(name("InstanceId").value("i-0e11209467d4fe4f0")))
                .build();

cloudwatchClient.describeAlarmsForMetric(request);

DescribeAlarmsForMetricRequest.builder()
                .metricName("CPUCreditUsage")
                .namespace("AWS/EC2")
                .dimensions(Arrays.asList(name("InstanceId").value("i-0e11209467d4fe4f0")))
                .build();

cloudwatchClient.describeAlarmsForMetric(request);

DescribeAlarmsForMetricRequest.builder()
                .metricName("CPUCreditBalance")
                .namespace("AWS/EC2")
                .dimensions(Arrays.asList(name("InstanceId").value("i-0e11209467d4fe4f0")))
                .build();

cloudwatchClient.describeAlarmsForMetric(request);

DescribeAlarmsForMetricRequest.builder()
                .metricName("CPUSurplusCreditsCharged")
                .namespace("AWS/EC2")
                .dimensions(Arrays.asList(name("InstanceId").value("i-0e11209467d4fe4f0")))
                .build();

cloudwatchClient.describeAlarmsForMetric(request);

DescribeAlarmsForMetricRequest.builder()
                .metricName("EBSReadOps")
                .namespace("AWS/EC2")
                .dimensions(Arrays.asList(name("InstanceId").value("i-0e11209467d4fe4f0")))
                .build();

cloudwatchClient.describeAlarmsForMetric(request);

DescribeAlarmsForMetricRequest.builder()
                .metricName("EBSIOBalance%")
                .namespace("AWS/EC2")
                .dimensions(Arrays.asList(name("InstanceId").value("i-0e11209467d4fe4f0")))
                .build();

cloudwatchClient.describeAlarmsForMetric(request);

DescribeAlarmsForMetricRequest.builder()
                .metricName("EBSReadBytes")
                .namespace("AWS/EC2")
                .dimensions(Arrays.asList(name("InstanceId").value("i-0e11209467d4fe4f0")))
                .build();

cloudwatchClient.describeAlarmsForMetric(request);

DescribeAlarmsForMetricRequest.builder()
                .metricName("EBSWriteOps")
                .namespace("AWS/EC2")
                .dimensions(Arrays.asList(name("InstanceId").value("i-0e11209467d4fe4f0")))
                .build();

cloudwatchClient.describeAlarmsForMetric(request);

DescribeAlarmsForMetricRequest.builder()
                .metricName("EBSByteBalance%")
                .namespace("AWS/EC2")
                .dimensions(Arrays.asList(name("InstanceId").value("i-0e11209467d4fe4f0")))
                .build();

cloudwatchClient.describeAlarmsForMetric(request);

DescribeAlarmsForMetricRequest.builder()
                .metricName("EBSWriteBytes")
                .namespace("AWS/EC2")
                .dimensions(Arrays.asList(name("InstanceId").value("i-0e11209467d4fe4f0")))
                .build();

cloudwatchClient.describeAlarmsForMetric(request);

DescribeAlarmsForMetricRequest.builder()
                .metricName("CPUUtilization")
                .namespace("AWS/EC2")
                .dimensions(Arrays.asList(name("InstanceId").value("i-0e11209467d4fe4f0")))
                .build();

cloudwatchClient.describeAlarmsForMetric(request);

DescribeAlarmsForMetricRequest.builder()
                .metricName("StatusCheckFailed_Instance")
                .namespace("AWS/EC2")
                .dimensions(Arrays.asList(name("InstanceId").value("i-0e11209467d4fe4f0")))
                .build();

cloudwatchClient.describeAlarmsForMetric(request);

DescribeAlarmsForMetricRequest.builder()
                .metricName("StatusCheckFailed")
                .namespace("AWS/EC2")
                .dimensions(Arrays.asList(name("InstanceId").value("i-0e11209467d4fe4f0")))
                .build();

cloudwatchClient.describeAlarmsForMetric(request);

DescribeAlarmsForMetricRequest.builder()
                .metricName("StatusCheckFailed_AttachedEBS")
                .namespace("AWS/EC2")
                .dimensions(Arrays.asList(name("InstanceId").value("i-0e11209467d4fe4f0")))
                .build();

cloudwatchClient.describeAlarmsForMetric(request);

DescribeAlarmsForMetricRequest.builder()
                .metricName("StatusCheckFailed_System")
                .namespace("AWS/EC2")
                .dimensions(Arrays.asList(name("InstanceId").value("i-0e11209467d4fe4f0")))
                .build();

cloudwatchClient.describeAlarmsForMetric(request);

DescribeSecurityGroupRulesRequest.builder()
                .filters(Arrays.asList(name("group-id").values(Arrays.asList("sg-03d8501cbeef83262"))))
                .maxResults(1000)
                .build();

ec2Client.describeSecurityGroupRules(request);

DescribeSecurityGroupsRequest.builder()
                .groupIds(Arrays.asList("sg-03d8501cbeef83262"))
                .build();

ec2Client.describeSecurityGroups(request);

DescribeInstanceCreditSpecificationsRequest.builder()
                .instanceIds(Arrays.asList("i-0e11209467d4fe4f0"))
                .build();

ec2Client.describeInstanceCreditSpecifications(request);

DescribeInstanceAttributeRequest.builder()
                .instanceId("i-0e11209467d4fe4f0")
                .attribute("disableApiStop")
                .build();

ec2Client.describeInstanceAttribute(request);

DescribeInstanceAttributeRequest.builder()
                .instanceId("i-0e11209467d4fe4f0")
                .attribute("disableApiTermination")
                .build();

ec2Client.describeInstanceAttribute(request);

DescribeNetworkInterfacesRequest.builder()
                .filters(Arrays.asList(name("attachment.instance-id").values(Arrays.asList("i-0e11209467d4fe4f0"))))
                .build();

ec2Client.describeNetworkInterfaces(request);

DescribeAddressesRequest.builder()
                .filters(Arrays.asList(name("instance-id").values(Arrays.asList("i-0e11209467d4fe4f0"))))
                .build();

ec2Client.describeAddresses(request);

DescribeInstancesRequest.builder()
                .instanceIds(Arrays.asList("i-0e11209467d4fe4f0"))
                .build();

ec2Client.describeInstances(request);

DescribeNetworkInterfacesRequest.builder()
                .filters(Arrays.asList(name("attachment.instance-id").values(Arrays.asList("i-0e11209467d4fe4f0"))))
                .build();

ec2Client.describeNetworkInterfaces(request);

DescribeReplaceRootVolumeTasksRequest.builder()
                .filters(Arrays.asList(name("instance-id").values(Arrays.asList("i-0e11209467d4fe4f0"))))
                .maxResults(50)
                .build();

ec2Client.describeReplaceRootVolumeTasks(request);

DescribeVolumesRequest.builder()
                .volumeIds(Arrays.asList("vol-068ef5c6e36f025a3"))
                .build();

ec2Client.describeVolumes(request);

GetEnrollmentStatusRequest.builder()

                .build();

compute-optimizerClient.getEnrollmentStatus(request);

DescribeEventsRequest.builder()
                .filter(services(Arrays.asList("EC2")).entityValues(Arrays.asList("i-0e11209467d4fe4f0")).eventTypeCodes(Arrays.asList("AWS_EC2_SIMPLIFIED_AUTO_RECOVERY_SUCCESS", "AWS_EC2_INSTANCE_AUTO_RECOVERY_SUCCESS", "AWS_EC2_SIMPLIFIED_AUTO_RECOVERY_FAILURE", "AWS_EC2_INSTANCE_AUTO_RECOVERY_FAILURE")).startTimes(Arrays.asList(from("2026-01-03T11:46:25.642Z"))))
                .build();

healthClient.describeEvents(request);

DescribeInstanceInformationRequest.builder()
                .filters(Arrays.asList(key("InstanceIds").values(Arrays.asList("i-0e11209467d4fe4f0"))))
                .build();

ssmClient.describeInstanceInformation(request);

DescribeInstanceStatusRequest.builder()
                .instanceIds(Arrays.asList("i-0e11209467d4fe4f0"))
                .build();

ec2Client.describeInstanceStatus(request);

DescribeInstanceConnectEndpointsRequest.builder()
                .maxResults(50)
                .build();

ec2Client.describeInstanceConnectEndpoints(request);

DescribeSecurityGroupsRequest.builder()
                .groupIds(Arrays.asList("sg-03d8501cbeef83262"))
                .build();

ec2Client.describeSecurityGroups(request);

DescribeImagesRequest.builder()
                .imageIds(Arrays.asList("ami-02b8269d5e85954ef"))
                .build();

ec2Client.describeImages(request);

DescribeInstanceStatusRequest.builder()
                .instanceIds(Arrays.asList("i-0e11209467d4fe4f0"))
                .build();

ec2Client.describeInstanceStatus(request);

DescribeRouteTablesRequest.builder()
                .filters(Arrays.asList(name("association.subnet-id").values(Arrays.asList("subnet-08d7538ac7b9c4999"))))
                .build();

ec2Client.describeRouteTables(request);

DescribeSecurityGroupsRequest.builder()
                .filters(Arrays.asList(name("vpc-id").values(Arrays.asList("vpc-0ce910c39715c2618"))))
                .build();

ec2Client.describeSecurityGroups(request);

DescribeVpcsRequest.builder()
                .maxResults(100)
                .filters(Arrays.asList(name("vpc-id").values(Arrays.asList("vpc-0ce910c39715c2618"))))
                .build();

ec2Client.describeVpcs(request);

DescribeSubnetsRequest.builder()
                .maxResults(100)
                .filters(Arrays.asList(name("vpc-id").values(Arrays.asList("vpc-0ce910c39715c2618"))))
                .build();

ec2Client.describeSubnets(request);

DescribeTagsRequest.builder()
                .maxResults(1000)
                .filters(Arrays.asList(name("resource-type").values(Arrays.asList("instance"))))
                .build();

ec2Client.describeTags(request);

DescribeAccountAttributesRequest.builder()

                .build();

ec2Client.describeAccountAttributes(request);

DescribeNetworkInterfacesRequest.builder()
                .filters(Arrays.asList(name("attachment.instance-id").values(Arrays.asList("i-0e11209467d4fe4f0"))))
                .build();

ec2Client.describeNetworkInterfaces(request);

DescribeInstanceStatusRequest.builder()
                .instanceIds(Arrays.asList("i-0e11209467d4fe4f0"))
                .build();

ec2Client.describeInstanceStatus(request);

DescribeInstanceCreditSpecificationsRequest.builder()
                .instanceIds(Arrays.asList("i-0e11209467d4fe4f0"))
                .build();

ec2Client.describeInstanceCreditSpecifications(request);

DescribeInstanceAttributeRequest.builder()
                .instanceId("i-0e11209467d4fe4f0")
                .attribute("disableApiStop")
                .build();

ec2Client.describeInstanceAttribute(request);

DescribeInstanceAttributeRequest.builder()
                .instanceId("i-0e11209467d4fe4f0")
                .attribute("disableApiTermination")
                .build();

ec2Client.describeInstanceAttribute(request);

DescribeNetworkInterfacesRequest.builder()
                .filters(Arrays.asList(name("attachment.instance-id").values(Arrays.asList("i-0e11209467d4fe4f0"))))
                .build();

ec2Client.describeNetworkInterfaces(request);

DescribeAddressesRequest.builder()
                .filters(Arrays.asList(name("instance-id").values(Arrays.asList("i-0e11209467d4fe4f0"))))
                .build();

ec2Client.describeAddresses(request);

DescribeInstancesRequest.builder()
                .instanceIds(Arrays.asList("i-0e11209467d4fe4f0"))
                .build();

ec2Client.describeInstances(request);

DescribeReplaceRootVolumeTasksRequest.builder()
                .filters(Arrays.asList(name("instance-id").values(Arrays.asList("i-0e11209467d4fe4f0"))))
                .maxResults(50)
                .build();

ec2Client.describeReplaceRootVolumeTasks(request);

DescribeVolumesRequest.builder()
                .volumeIds(Arrays.asList("vol-068ef5c6e36f025a3"))
                .build();

ec2Client.describeVolumes(request);

DescribeInstanceStatusRequest.builder()
                .instanceIds(Arrays.asList("i-0e11209467d4fe4f0"))
                .build();

ec2Client.describeInstanceStatus(request);

DescribeInstancesRequest.builder()
                .maxResults(100)
                .build();

ec2Client.describeInstances(request);

DescribeEventsRequest.builder()
                .filter(services(Arrays.asList("EC2")).entityValues(Arrays.asList("i-0e11209467d4fe4f0")).eventTypeCodes(Arrays.asList("AWS_EC2_SIMPLIFIED_AUTO_RECOVERY_SUCCESS", "AWS_EC2_INSTANCE_AUTO_RECOVERY_SUCCESS", "AWS_EC2_SIMPLIFIED_AUTO_RECOVERY_FAILURE", "AWS_EC2_INSTANCE_AUTO_RECOVERY_FAILURE")).startTimes(Arrays.asList(from("2026-01-03T12:10:06.796Z"))))
                .build();

healthClient.describeEvents(request);

GetEnrollmentStatusRequest.builder()

                .build();

compute-optimizerClient.getEnrollmentStatus(request);

DescribeInstanceInformationRequest.builder()
                .filters(Arrays.asList(key("InstanceIds").values(Arrays.asList("i-0e11209467d4fe4f0"))))
                .build();

ssmClient.describeInstanceInformation(request);

DescribeInstanceStatusRequest.builder()
                .instanceIds(Arrays.asList("i-0e11209467d4fe4f0"))
                .build();

ec2Client.describeInstanceStatus(request);

DescribeInstanceStatusRequest.builder()
                .instanceIds(Arrays.asList("i-0e11209467d4fe4f0"))
                .build();

ec2Client.describeInstanceStatus(request);

DescribeNetworkInterfacesRequest.builder()
                .filters(Arrays.asList(name("attachment.instance-id").values(Arrays.asList("i-0e11209467d4fe4f0"))))
                .build();

ec2Client.describeNetworkInterfaces(request);

DescribeInstanceCreditSpecificationsRequest.builder()
                .instanceIds(Arrays.asList("i-0e11209467d4fe4f0"))
                .build();

ec2Client.describeInstanceCreditSpecifications(request);

DescribeInstanceAttributeRequest.builder()
                .instanceId("i-0e11209467d4fe4f0")
                .attribute("disableApiStop")
                .build();

ec2Client.describeInstanceAttribute(request);

DescribeInstanceAttributeRequest.builder()
                .instanceId("i-0e11209467d4fe4f0")
                .attribute("disableApiTermination")
                .build();

ec2Client.describeInstanceAttribute(request);

DescribeNetworkInterfacesRequest.builder()
                .filters(Arrays.asList(name("attachment.instance-id").values(Arrays.asList("i-0e11209467d4fe4f0"))))
                .build();

ec2Client.describeNetworkInterfaces(request);

DescribeAddressesRequest.builder()
                .filters(Arrays.asList(name("instance-id").values(Arrays.asList("i-0e11209467d4fe4f0"))))
                .build();

ec2Client.describeAddresses(request);

DescribeInstancesRequest.builder()
                .instanceIds(Arrays.asList("i-0e11209467d4fe4f0"))
                .build();

ec2Client.describeInstances(request);

DescribeReplaceRootVolumeTasksRequest.builder()
                .filters(Arrays.asList(name("instance-id").values(Arrays.asList("i-0e11209467d4fe4f0"))))
                .maxResults(50)
                .build();

ec2Client.describeReplaceRootVolumeTasks(request);

DescribeVolumesRequest.builder()
                .volumeIds(Arrays.asList("vol-068ef5c6e36f025a3"))
                .build();

ec2Client.describeVolumes(request);

DescribeEventsRequest.builder()
                .filter(services(Arrays.asList("EC2")).entityValues(Arrays.asList("i-0e11209467d4fe4f0")).eventTypeCodes(Arrays.asList("AWS_EC2_SIMPLIFIED_AUTO_RECOVERY_SUCCESS", "AWS_EC2_INSTANCE_AUTO_RECOVERY_SUCCESS", "AWS_EC2_SIMPLIFIED_AUTO_RECOVERY_FAILURE", "AWS_EC2_INSTANCE_AUTO_RECOVERY_FAILURE")).startTimes(Arrays.asList(from("2026-01-03T12:10:15.463Z"))))
                .build();

healthClient.describeEvents(request);

GetEnrollmentStatusRequest.builder()

                .build();

compute-optimizerClient.getEnrollmentStatus(request);

DescribeInstanceInformationRequest.builder()
                .filters(Arrays.asList(key("InstanceIds").values(Arrays.asList("i-0e11209467d4fe4f0"))))
                .build();

ssmClient.describeInstanceInformation(request);

DescribeInstanceStatusRequest.builder()
                .instanceIds(Arrays.asList("i-0e11209467d4fe4f0"))
                .build();

ec2Client.describeInstanceStatus(request);

DescribeSecurityGroupRulesRequest.builder()
                .filters(Arrays.asList(name("group-id").values(Arrays.asList("sg-03d8501cbeef83262"))))
                .maxResults(1000)
                .build();

ec2Client.describeSecurityGroupRules(request);

DescribeSecurityGroupsRequest.builder()
                .groupIds(Arrays.asList("sg-03d8501cbeef83262"))
                .build();

ec2Client.describeSecurityGroups(request);

DescribeManagedPrefixListsRequest.builder()
                .maxResults(100)
                .build();

ec2Client.describeManagedPrefixLists(request);

DescribeSecurityGroupsRequest.builder()
                .groupIds(Arrays.asList("sg-03d8501cbeef83262"))
                .build();

ec2Client.describeSecurityGroups(request);

DescribeVpcsRequest.builder()
                .vpcIds(Arrays.asList("vpc-0ce910c39715c2618"))
                .build();

ec2Client.describeVpcs(request);

DescribeSecurityGroupRulesRequest.builder()
                .maxResults(1000)
                .filters(Arrays.asList(name("group-id").values(Arrays.asList("sg-03d8501cbeef83262"))))
                .build();

ec2Client.describeSecurityGroupRules(request);

DescribeReplaceRootVolumeTasksRequest.builder()
                .filters(Arrays.asList(name("instance-id").values(Arrays.asList("i-0e11209467d4fe4f0"))))
                .maxResults(50)
                .build();

ec2Client.describeReplaceRootVolumeTasks(request);

DescribeVolumesRequest.builder()
                .volumeIds(Arrays.asList("vol-068ef5c6e36f025a3"))
                .build();

ec2Client.describeVolumes(request);

DescribeInstanceCreditSpecificationsRequest.builder()
                .instanceIds(Arrays.asList("i-0e11209467d4fe4f0"))
                .build();

ec2Client.describeInstanceCreditSpecifications(request);

DescribeInstanceAttributeRequest.builder()
                .instanceId("i-0e11209467d4fe4f0")
                .attribute("disableApiStop")
                .build();

ec2Client.describeInstanceAttribute(request);

DescribeInstanceAttributeRequest.builder()
                .instanceId("i-0e11209467d4fe4f0")
                .attribute("disableApiTermination")
                .build();

ec2Client.describeInstanceAttribute(request);

DescribeNetworkInterfacesRequest.builder()
                .filters(Arrays.asList(name("attachment.instance-id").values(Arrays.asList("i-0e11209467d4fe4f0"))))
                .build();

ec2Client.describeNetworkInterfaces(request);

DescribeAddressesRequest.builder()
                .filters(Arrays.asList(name("instance-id").values(Arrays.asList("i-0e11209467d4fe4f0"))))
                .build();

ec2Client.describeAddresses(request);

DescribeInstancesRequest.builder()
                .instanceIds(Arrays.asList("i-0e11209467d4fe4f0"))
                .build();

ec2Client.describeInstances(request);

DescribeNetworkInterfacesRequest.builder()
                .filters(Arrays.asList(name("attachment.instance-id").values(Arrays.asList("i-0e11209467d4fe4f0"))))
                .build();

ec2Client.describeNetworkInterfaces(request);

DescribeInstanceInformationRequest.builder()
                .filters(Arrays.asList(key("InstanceIds").values(Arrays.asList("i-0e11209467d4fe4f0"))))
                .build();

ssmClient.describeInstanceInformation(request);

GetEnrollmentStatusRequest.builder()

                .build();

compute-optimizerClient.getEnrollmentStatus(request);

DescribeEventsRequest.builder()
                .filter(services(Arrays.asList("EC2")).entityValues(Arrays.asList("i-0e11209467d4fe4f0")).eventTypeCodes(Arrays.asList("AWS_EC2_SIMPLIFIED_AUTO_RECOVERY_SUCCESS", "AWS_EC2_INSTANCE_AUTO_RECOVERY_SUCCESS", "AWS_EC2_SIMPLIFIED_AUTO_RECOVERY_FAILURE", "AWS_EC2_INSTANCE_AUTO_RECOVERY_FAILURE")).startTimes(Arrays.asList(from("2026-01-03T12:12:10.164Z"))))
                .build();

healthClient.describeEvents(request);

DescribeInstanceStatusRequest.builder()
                .instanceIds(Arrays.asList("i-0e11209467d4fe4f0"))
                .build();

ec2Client.describeInstanceStatus(request);

DescribeTagsRequest.builder()
                .maxResults(1000)
                .filters(Arrays.asList(name("resource-type").values(Arrays.asList("instance"))))
                .build();

ec2Client.describeTags(request);

DescribeAccountAttributesRequest.builder()

                .build();

ec2Client.describeAccountAttributes(request);

DescribeNetworkInterfacesRequest.builder()
                .filters(Arrays.asList(name("attachment.instance-id").values(Arrays.asList("i-0e11209467d4fe4f0"))))
                .build();

ec2Client.describeNetworkInterfaces(request);

DescribeInstanceStatusRequest.builder()
                .instanceIds(Arrays.asList("i-0e11209467d4fe4f0"))
                .build();

ec2Client.describeInstanceStatus(request);

DescribeInstanceCreditSpecificationsRequest.builder()
                .instanceIds(Arrays.asList("i-0e11209467d4fe4f0"))
                .build();

ec2Client.describeInstanceCreditSpecifications(request);

DescribeInstanceAttributeRequest.builder()
                .instanceId("i-0e11209467d4fe4f0")
                .attribute("disableApiStop")
                .build();

ec2Client.describeInstanceAttribute(request);

DescribeInstanceAttributeRequest.builder()
                .instanceId("i-0e11209467d4fe4f0")
                .attribute("disableApiTermination")
                .build();

ec2Client.describeInstanceAttribute(request);

DescribeNetworkInterfacesRequest.builder()
                .filters(Arrays.asList(name("attachment.instance-id").values(Arrays.asList("i-0e11209467d4fe4f0"))))
                .build();

ec2Client.describeNetworkInterfaces(request);

DescribeAddressesRequest.builder()
                .filters(Arrays.asList(name("instance-id").values(Arrays.asList("i-0e11209467d4fe4f0"))))
                .build();

ec2Client.describeAddresses(request);

DescribeInstancesRequest.builder()
                .instanceIds(Arrays.asList("i-0e11209467d4fe4f0"))
                .build();

ec2Client.describeInstances(request);

DescribeReplaceRootVolumeTasksRequest.builder()
                .filters(Arrays.asList(name("instance-id").values(Arrays.asList("i-0e11209467d4fe4f0"))))
                .maxResults(50)
                .build();

ec2Client.describeReplaceRootVolumeTasks(request);

DescribeVolumesRequest.builder()
                .volumeIds(Arrays.asList("vol-068ef5c6e36f025a3"))
                .build();

ec2Client.describeVolumes(request);

DescribeInstanceStatusRequest.builder()
                .instanceIds(Arrays.asList("i-0e11209467d4fe4f0"))
                .build();

ec2Client.describeInstanceStatus(request);

DescribeInstanceInformationRequest.builder()
                .filters(Arrays.asList(key("InstanceIds").values(Arrays.asList("i-0e11209467d4fe4f0"))))
                .build();

ssmClient.describeInstanceInformation(request);

DescribeEventsRequest.builder()
                .filter(services(Arrays.asList("EC2")).entityValues(Arrays.asList("i-0e11209467d4fe4f0")).eventTypeCodes(Arrays.asList("AWS_EC2_SIMPLIFIED_AUTO_RECOVERY_SUCCESS", "AWS_EC2_INSTANCE_AUTO_RECOVERY_SUCCESS", "AWS_EC2_SIMPLIFIED_AUTO_RECOVERY_FAILURE", "AWS_EC2_INSTANCE_AUTO_RECOVERY_FAILURE")).startTimes(Arrays.asList(from("2026-01-03T12:12:17.944Z"))))
                .build();

healthClient.describeEvents(request);

GetEnrollmentStatusRequest.builder()

                .build();

compute-optimizerClient.getEnrollmentStatus(request);

DescribeInstanceStatusRequest.builder()
                .instanceIds(Arrays.asList("i-0e11209467d4fe4f0"))
                .build();

ec2Client.describeInstanceStatus(request);

DescribeSecurityGroupRulesRequest.builder()
                .filters(Arrays.asList(name("group-id").values(Arrays.asList("sg-03d8501cbeef83262"))))
                .maxResults(1000)
                .build();

ec2Client.describeSecurityGroupRules(request);

DescribeSecurityGroupsRequest.builder()
                .groupIds(Arrays.asList("sg-03d8501cbeef83262"))
                .build();

ec2Client.describeSecurityGroups(request);

DescribeAlarmsForMetricRequest.builder()
                .metricName("EBSReadOps")
                .namespace("AWS/EC2")
                .dimensions(Arrays.asList(name("InstanceId").value("i-0e11209467d4fe4f0")))
                .build();

cloudwatchClient.describeAlarmsForMetric(request);

DescribeAlarmsForMetricRequest.builder()
                .metricName("EBSIOBalance%")
                .namespace("AWS/EC2")
                .dimensions(Arrays.asList(name("InstanceId").value("i-0e11209467d4fe4f0")))
                .build();

cloudwatchClient.describeAlarmsForMetric(request);

DescribeAlarmsForMetricRequest.builder()
                .metricName("EBSReadBytes")
                .namespace("AWS/EC2")
                .dimensions(Arrays.asList(name("InstanceId").value("i-0e11209467d4fe4f0")))
                .build();

cloudwatchClient.describeAlarmsForMetric(request);

DescribeAlarmsForMetricRequest.builder()
                .metricName("EBSWriteOps")
                .namespace("AWS/EC2")
                .dimensions(Arrays.asList(name("InstanceId").value("i-0e11209467d4fe4f0")))
                .build();

cloudwatchClient.describeAlarmsForMetric(request);

DescribeAlarmsForMetricRequest.builder()
                .metricName("EBSByteBalance%")
                .namespace("AWS/EC2")
                .dimensions(Arrays.asList(name("InstanceId").value("i-0e11209467d4fe4f0")))
                .build();

cloudwatchClient.describeAlarmsForMetric(request);

DescribeAlarmsForMetricRequest.builder()
                .metricName("EBSWriteBytes")
                .namespace("AWS/EC2")
                .dimensions(Arrays.asList(name("InstanceId").value("i-0e11209467d4fe4f0")))
                .build();

cloudwatchClient.describeAlarmsForMetric(request);

DescribeAlarmsForMetricRequest.builder()
                .metricName("CPUUtilization")
                .namespace("AWS/EC2")
                .dimensions(Arrays.asList(name("InstanceId").value("i-0e11209467d4fe4f0")))
                .build();

cloudwatchClient.describeAlarmsForMetric(request);

DescribeAlarmsForMetricRequest.builder()
                .metricName("MetadataNoToken")
                .namespace("AWS/EC2")
                .dimensions(Arrays.asList(name("InstanceId").value("i-0e11209467d4fe4f0")))
                .build();

cloudwatchClient.describeAlarmsForMetric(request);

DescribeAlarmsForMetricRequest.builder()
                .metricName("CPUSurplusCreditsCharged")
                .namespace("AWS/EC2")
                .dimensions(Arrays.asList(name("InstanceId").value("i-0e11209467d4fe4f0")))
                .build();

cloudwatchClient.describeAlarmsForMetric(request);

DescribeAlarmsForMetricRequest.builder()
                .metricName("CPUSurplusCreditBalance")
                .namespace("AWS/EC2")
                .dimensions(Arrays.asList(name("InstanceId").value("i-0e11209467d4fe4f0")))
                .build();

cloudwatchClient.describeAlarmsForMetric(request);

DescribeAlarmsForMetricRequest.builder()
                .metricName("CPUCreditUsage")
                .namespace("AWS/EC2")
                .dimensions(Arrays.asList(name("InstanceId").value("i-0e11209467d4fe4f0")))
                .build();

cloudwatchClient.describeAlarmsForMetric(request);

DescribeAlarmsForMetricRequest.builder()
                .metricName("CPUCreditBalance")
                .namespace("AWS/EC2")
                .dimensions(Arrays.asList(name("InstanceId").value("i-0e11209467d4fe4f0")))
                .build();

cloudwatchClient.describeAlarmsForMetric(request);

DescribeAlarmsForMetricRequest.builder()
                .metricName("NetworkIn")
                .namespace("AWS/EC2")
                .dimensions(Arrays.asList(name("InstanceId").value("i-0e11209467d4fe4f0")))
                .build();

cloudwatchClient.describeAlarmsForMetric(request);

DescribeAlarmsForMetricRequest.builder()
                .metricName("NetworkPacketsIn")
                .namespace("AWS/EC2")
                .dimensions(Arrays.asList(name("InstanceId").value("i-0e11209467d4fe4f0")))
                .build();

cloudwatchClient.describeAlarmsForMetric(request);

DescribeAlarmsForMetricRequest.builder()
                .metricName("NetworkOut")
                .namespace("AWS/EC2")
                .dimensions(Arrays.asList(name("InstanceId").value("i-0e11209467d4fe4f0")))
                .build();

cloudwatchClient.describeAlarmsForMetric(request);

DescribeAlarmsForMetricRequest.builder()
                .metricName("CPUSurplusCreditBalance")
                .namespace("AWS/EC2")
                .dimensions(Arrays.asList(name("InstanceId").value("i-0e11209467d4fe4f0")))
                .build();

cloudwatchClient.describeAlarmsForMetric(request);

GetEnrollmentStatusRequest.builder()

                .build();

compute-optimizerClient.getEnrollmentStatus(request);

DescribeAlarmsForMetricRequest.builder()
                .metricName("CPUCreditUsage")
                .namespace("AWS/EC2")
                .dimensions(Arrays.asList(name("InstanceId").value("i-0e11209467d4fe4f0")))
                .build();

cloudwatchClient.describeAlarmsForMetric(request);

DescribeAlarmsForMetricRequest.builder()
                .metricName("CPUCreditBalance")
                .namespace("AWS/EC2")
                .dimensions(Arrays.asList(name("InstanceId").value("i-0e11209467d4fe4f0")))
                .build();

cloudwatchClient.describeAlarmsForMetric(request);

DescribeAlarmsForMetricRequest.builder()
                .metricName("StatusCheckFailed_Instance")
                .namespace("AWS/EC2")
                .dimensions(Arrays.asList(name("InstanceId").value("i-0e11209467d4fe4f0")))
                .build();

cloudwatchClient.describeAlarmsForMetric(request);

DescribeAlarmsForMetricRequest.builder()
                .metricName("StatusCheckFailed")
                .namespace("AWS/EC2")
                .dimensions(Arrays.asList(name("InstanceId").value("i-0e11209467d4fe4f0")))
                .build();

cloudwatchClient.describeAlarmsForMetric(request);

DescribeAlarmsForMetricRequest.builder()
                .metricName("StatusCheckFailed_AttachedEBS")
                .namespace("AWS/EC2")
                .dimensions(Arrays.asList(name("InstanceId").value("i-0e11209467d4fe4f0")))
                .build();

cloudwatchClient.describeAlarmsForMetric(request);

DescribeAlarmsForMetricRequest.builder()
                .metricName("StatusCheckFailed_System")
                .namespace("AWS/EC2")
                .dimensions(Arrays.asList(name("InstanceId").value("i-0e11209467d4fe4f0")))
                .build();

cloudwatchClient.describeAlarmsForMetric(request);

DescribeAlarmsForMetricRequest.builder()
                .metricName("CPUUtilization")
                .namespace("AWS/EC2")
                .dimensions(Arrays.asList(name("InstanceId").value("i-0e11209467d4fe4f0")))
                .build();

cloudwatchClient.describeAlarmsForMetric(request);

DescribeAlarmsForMetricRequest.builder()
                .metricName("MetadataNoToken")
                .namespace("AWS/EC2")
                .dimensions(Arrays.asList(name("InstanceId").value("i-0e11209467d4fe4f0")))
                .build();

cloudwatchClient.describeAlarmsForMetric(request);

DescribeAlarmsForMetricRequest.builder()
                .metricName("InstanceEBSIOPSExceededCheck")
                .namespace("AWS/EC2")
                .dimensions(Arrays.asList(name("InstanceId").value("i-0e11209467d4fe4f0")))
                .build();

cloudwatchClient.describeAlarmsForMetric(request);

DescribeAlarmsForMetricRequest.builder()
                .metricName("InstanceEBSThroughputExceededCheck")
                .namespace("AWS/EC2")
                .dimensions(Arrays.asList(name("InstanceId").value("i-0e11209467d4fe4f0")))
                .build();

cloudwatchClient.describeAlarmsForMetric(request);

DescribeAlarmsForMetricRequest.builder()
                .metricName("VolumeAvgThroughput")
                .namespace("AWS/EBS")
                .dimensions(Arrays.asList(name("VolumeId").value("vol-068ef5c6e36f025a3"), name("InstanceId").value("i-0e11209467d4fe4f0")))
                .build();

cloudwatchClient.describeAlarmsForMetric(request);

DescribeAlarmsForMetricRequest.builder()
                .metricName("VolumeStalledIOCheck")
                .namespace("AWS/EBS")
                .dimensions(Arrays.asList(name("VolumeId").value("vol-068ef5c6e36f025a3"), name("InstanceId").value("i-0e11209467d4fe4f0")))
                .build();

cloudwatchClient.describeAlarmsForMetric(request);

DescribeAlarmsForMetricRequest.builder()
                .metricName("VolumeIOPSExceededCheck")
                .namespace("AWS/EBS")
                .dimensions(Arrays.asList(name("VolumeId").value("vol-068ef5c6e36f025a3"), name("InstanceId").value("i-0e11209467d4fe4f0")))
                .build();

cloudwatchClient.describeAlarmsForMetric(request);

DescribeAlarmsForMetricRequest.builder()
                .metricName("VolumeAvgWriteLatency")
                .namespace("AWS/EBS")
                .dimensions(Arrays.asList(name("VolumeId").value("vol-068ef5c6e36f025a3"), name("InstanceId").value("i-0e11209467d4fe4f0")))
                .build();

cloudwatchClient.describeAlarmsForMetric(request);

DescribeAlarmsForMetricRequest.builder()
                .metricName("VolumeAvgIOPS")
                .namespace("AWS/EBS")
                .dimensions(Arrays.asList(name("VolumeId").value("vol-068ef5c6e36f025a3"), name("InstanceId").value("i-0e11209467d4fe4f0")))
                .build();

cloudwatchClient.describeAlarmsForMetric(request);

DescribeAlarmsForMetricRequest.builder()
                .metricName("VolumeThroughputExceededCheck")
                .namespace("AWS/EBS")
                .dimensions(Arrays.asList(name("VolumeId").value("vol-068ef5c6e36f025a3"), name("InstanceId").value("i-0e11209467d4fe4f0")))
                .build();

cloudwatchClient.describeAlarmsForMetric(request);

DescribeAlarmsForMetricRequest.builder()
                .metricName("VolumeAvgReadLatency")
                .namespace("AWS/EBS")
                .dimensions(Arrays.asList(name("VolumeId").value("vol-068ef5c6e36f025a3"), name("InstanceId").value("i-0e11209467d4fe4f0")))
                .build();

cloudwatchClient.describeAlarmsForMetric(request);

DescribeAlarmsForMetricRequest.builder()
                .metricName("EBSReadOps")
                .namespace("AWS/EC2")
                .dimensions(Arrays.asList(name("InstanceId").value("i-0e11209467d4fe4f0")))
                .build();

cloudwatchClient.describeAlarmsForMetric(request);

DescribeAlarmsForMetricRequest.builder()
                .metricName("EBSIOBalance%")
                .namespace("AWS/EC2")
                .dimensions(Arrays.asList(name("InstanceId").value("i-0e11209467d4fe4f0")))
                .build();

cloudwatchClient.describeAlarmsForMetric(request);

DescribeAlarmsForMetricRequest.builder()
                .metricName("EBSReadBytes")
                .namespace("AWS/EC2")
                .dimensions(Arrays.asList(name("InstanceId").value("i-0e11209467d4fe4f0")))
                .build();

cloudwatchClient.describeAlarmsForMetric(request);

DescribeAlarmsForMetricRequest.builder()
                .metricName("EBSWriteOps")
                .namespace("AWS/EC2")
                .dimensions(Arrays.asList(name("InstanceId").value("i-0e11209467d4fe4f0")))
                .build();

cloudwatchClient.describeAlarmsForMetric(request);

DescribeAlarmsForMetricRequest.builder()
                .metricName("EBSByteBalance%")
                .namespace("AWS/EC2")
                .dimensions(Arrays.asList(name("InstanceId").value("i-0e11209467d4fe4f0")))
                .build();

cloudwatchClient.describeAlarmsForMetric(request);

DescribeAlarmsForMetricRequest.builder()
                .metricName("EBSWriteBytes")
                .namespace("AWS/EC2")
                .dimensions(Arrays.asList(name("InstanceId").value("i-0e11209467d4fe4f0")))
                .build();

cloudwatchClient.describeAlarmsForMetric(request);

DescribeImagesRequest.builder()
                .imageIds(Arrays.asList("ami-02b8269d5e85954ef"))
                .build();

ec2Client.describeImages(request);

DescribeInstanceConnectEndpointsRequest.builder()
                .maxResults(50)
                .build();

ec2Client.describeInstanceConnectEndpoints(request);

DescribeSecurityGroupsRequest.builder()
                .groupIds(Arrays.asList("sg-03d8501cbeef83262"))
                .build();

ec2Client.describeSecurityGroups(request);

DescribeVpcsRequest.builder()
                .maxResults(100)
                .filters(Arrays.asList(name("vpc-id").values(Arrays.asList("vpc-0ce910c39715c2618"))))
                .build();

ec2Client.describeVpcs(request);

DescribeSubnetsRequest.builder()
                .maxResults(100)
                .filters(Arrays.asList(name("vpc-id").values(Arrays.asList("vpc-0ce910c39715c2618"))))
                .build();

ec2Client.describeSubnets(request);

DescribeSecurityGroupsRequest.builder()
                .filters(Arrays.asList(name("vpc-id").values(Arrays.asList("vpc-0ce910c39715c2618"))))
                .build();

ec2Client.describeSecurityGroups(request);

DescribeAlarmsForMetricRequest.builder()
                .metricName("CPUSurplusCreditsCharged")
                .namespace("AWS/EC2")
                .dimensions(Arrays.asList(name("InstanceId").value("i-0e11209467d4fe4f0")))
                .build();

cloudwatchClient.describeAlarmsForMetric(request);

DescribeAlarmsForMetricRequest.builder()
                .metricName("NetworkIn")
                .namespace("AWS/EC2")
                .dimensions(Arrays.asList(name("InstanceId").value("i-0e11209467d4fe4f0")))
                .build();

cloudwatchClient.describeAlarmsForMetric(request);

DescribeAlarmsForMetricRequest.builder()
                .metricName("NetworkPacketsIn")
                .namespace("AWS/EC2")
                .dimensions(Arrays.asList(name("InstanceId").value("i-0e11209467d4fe4f0")))
                .build();

cloudwatchClient.describeAlarmsForMetric(request);

DescribeAlarmsForMetricRequest.builder()
                .metricName("NetworkOut")
                .namespace("AWS/EC2")
                .dimensions(Arrays.asList(name("InstanceId").value("i-0e11209467d4fe4f0")))
                .build();

cloudwatchClient.describeAlarmsForMetric(request);

DescribeAlarmsForMetricRequest.builder()
                .metricName("NetworkPacketsOut")
                .namespace("AWS/EC2")
                .dimensions(Arrays.asList(name("InstanceId").value("i-0e11209467d4fe4f0")))
                .build();

cloudwatchClient.describeAlarmsForMetric(request);

DescribeAccountAttributesRequest.builder()

                .build();

ec2Client.describeAccountAttributes(request);

DescribeAvailabilityZonesRequest.builder()

                .build();

ec2Client.describeAvailabilityZones(request);

DescribeEventsRequest.builder()
                .filter(regions(Arrays.asList("ap-south-1", "global")).services(Arrays.asList("EC2", "MULTIPLE_SERVICES")).eventStatusCodes(Arrays.asList("open")).eventTypeCategories(Arrays.asList("issue")).lastUpdatedTimes(Arrays.asList(from("2025-12-31T12:15:09.133Z"))))
                .maxResults(100)
                .build();

healthClient.describeEvents(request);

DescribeVolumeStatusRequest.builder()
                .maxResults(1000)
                .build();

ec2Client.describeVolumeStatus(request);

DescribeInstanceStatusRequest.builder()
                .maxResults(1000)
                .build();

ec2Client.describeInstanceStatus(request);

DescribeAlarmsRequest.builder()
                .maxRecords(100)
                .stateValue("ALARM")
                .build();

cloudwatchClient.describeAlarms(request);

DescribeLaunchTemplatesRequest.builder()
                .maxResults(1)
                .build();

ec2Client.describeLaunchTemplates(request);

DescribeAlarmsRequest.builder()
                .maxRecords(100)
                .stateValue("OK")
                .build();

cloudwatchClient.describeAlarms(request);

DescribeAlarmsRequest.builder()
                .maxRecords(100)
                .stateValue("INSUFFICIENT_DATA")
                .build();

cloudwatchClient.describeAlarms(request);

DescribeRegionsRequest.builder()
                .allRegions(true)
                .build();

ec2Client.describeRegions(request);

DescribeDhcpOptionsRequest.builder()
                .maxResults(1000)
                .build();

ec2Client.describeDhcpOptions(request);

DescribeVpcBlockPublicAccessOptionsRequest.builder()

                .build();

ec2Client.describeVpcBlockPublicAccessOptions(request);

DescribeAccountAttributesRequest.builder()
                .attributeNames(Arrays.asList("supported-platforms"))
                .build();

ec2Client.describeAccountAttributes(request);

DescribeVpcsRequest.builder()
                .maxResults(1000)
                .build();

ec2Client.describeVpcs(request);

DescribeSubnetsRequest.builder()
                .maxResults(1000)
                .build();

ec2Client.describeSubnets(request);

DescribeRouteTablesRequest.builder()
                .maxResults(100)
                .build();

ec2Client.describeRouteTables(request);

DescribeInternetGatewaysRequest.builder()
                .maxResults(1000)
                .build();

ec2Client.describeInternetGateways(request);

DescribeEgressOnlyInternetGatewaysRequest.builder()
                .maxResults(255)
                .build();

ec2Client.describeEgressOnlyInternetGateways(request);

DescribeAddressesRequest.builder()

                .build();

ec2Client.describeAddresses(request);

DescribeInstanceConnectEndpointsRequest.builder()
                .maxResults(50)
                .build();

ec2Client.describeInstanceConnectEndpoints(request);

DescribeVpcEndpointsRequest.builder()
                .maxResults(1000)
                .build();

ec2Client.describeVpcEndpoints(request);

DescribeVpcEndpointServiceConfigurationsRequest.builder()
                .maxResults(1000)
                .build();

ec2Client.describeVpcEndpointServiceConfigurations(request);

DescribeNatGatewaysRequest.builder()
                .maxResults(1000)
                .build();

ec2Client.describeNatGateways(request);

DescribeVpcPeeringConnectionsRequest.builder()
                .maxResults(1000)
                .build();

ec2Client.describeVpcPeeringConnections(request);

DescribeNetworkAclsRequest.builder()
                .maxResults(1000)
                .build();

ec2Client.describeNetworkAcls(request);

DescribeSecurityGroupsRequest.builder()
                .maxResults(1000)
                .build();

ec2Client.describeSecurityGroups(request);

DescribeCustomerGatewaysRequest.builder()

                .build();

ec2Client.describeCustomerGateways(request);

DescribeVpnGatewaysRequest.builder()

                .build();

ec2Client.describeVpnGateways(request);

DescribeVpnConnectionsRequest.builder()

                .build();

ec2Client.describeVpnConnections(request);

DescribeInstancesRequest.builder()
                .maxResults(1000)
                .filters(Arrays.asList(name("instance-state-name").values(Arrays.asList("running"))))
                .build();

ec2Client.describeInstances(request);

DescribeSecurityGroupsRequest.builder()
                .maxResults(1000)
                .build();

ec2Client.describeSecurityGroups(request);

DescribeManagedPrefixListsRequest.builder()
                .maxResults(100)
                .build();

ec2Client.describeManagedPrefixLists(request);

DescribeManagedPrefixListsRequest.builder()
                .maxResults(100)
                .build();

ec2Client.describeManagedPrefixLists(request);

DescribeVpcsRequest.builder()
                .maxResults(1000)
                .build();

ec2Client.describeVpcs(request);

DescribeSecurityGroupsRequest.builder()
                .groupIds(Arrays.asList("sg-03d8501cbeef83262"))
                .build();

ec2Client.describeSecurityGroups(request);

DescribeVpcsRequest.builder()
                .vpcIds(Arrays.asList("vpc-0ce910c39715c2618"))
                .build();

ec2Client.describeVpcs(request);

DescribeSecurityGroupRulesRequest.builder()
                .maxResults(1000)
                .filters(Arrays.asList(name("group-id").values(Arrays.asList("sg-03d8501cbeef83262"))))
                .build();

ec2Client.describeSecurityGroupRules(request);

DescribeSecurityGroupsRequest.builder()
                .groupIds(Arrays.asList("sg-03d8501cbeef83262"))
                .build();

ec2Client.describeSecurityGroups(request);

DescribeSecurityGroupRulesRequest.builder()
                .maxResults(1000)
                .filters(Arrays.asList(name("group-id").values(Arrays.asList("sg-03d8501cbeef83262"))))
                .build();

ec2Client.describeSecurityGroupRules(request);

DescribeManagedPrefixListsRequest.builder()
                .maxResults(100)
                .build();

ec2Client.describeManagedPrefixLists(request);

DescribeSecurityGroupsRequest.builder()
                .maxResults(1000)
                .filters(Arrays.asList(name("vpc-id").values(Arrays.asList("vpc-0ce910c39715c2618"))))
                .build();

ec2Client.describeSecurityGroups(request);

ModifySecurityGroupRulesRequest.builder()
                .groupId("sg-03d8501cbeef83262")
                .securityGroupRules(Arrays.asList(securityGroupRuleId("sgr-048bd01e1a233003f").securityGroupRule(ipProtocol("tcp").fromPort(22).toPort(22).cidrIpv4("0.0.0.0/0"))))
                .build();

ec2Client.modifySecurityGroupRules(request);

DescribeSecurityGroupsRequest.builder()
                .groupIds(Arrays.asList("sg-03d8501cbeef83262"))
                .build();

ec2Client.describeSecurityGroups(request);

DescribeVpcsRequest.builder()
                .vpcIds(Arrays.asList("vpc-0ce910c39715c2618"))
                .build();

ec2Client.describeVpcs(request);

DescribeSecurityGroupRulesRequest.builder()
                .maxResults(1000)
                .filters(Arrays.asList(name("group-id").values(Arrays.asList("sg-03d8501cbeef83262"))))
                .build();

ec2Client.describeSecurityGroupRules(request);

DescribeEventsRequest.builder()
                .filter(regions(Arrays.asList("ap-south-1", "global")).services(Arrays.asList("EC2", "MULTIPLE_SERVICES")).eventStatusCodes(Arrays.asList("open")).eventTypeCategories(Arrays.asList("issue")).lastUpdatedTimes(Arrays.asList(from("2025-12-31T12:18:05.900Z"))))
                .maxResults(100)
                .build();

healthClient.describeEvents(request);

DescribeVolumeStatusRequest.builder()
                .maxResults(1000)
                .build();

ec2Client.describeVolumeStatus(request);

DescribeInstanceStatusRequest.builder()
                .maxResults(1000)
                .build();

ec2Client.describeInstanceStatus(request);

DescribeAlarmsRequest.builder()
                .maxRecords(100)
                .stateValue("ALARM")
                .build();

cloudwatchClient.describeAlarms(request);

DescribeLaunchTemplatesRequest.builder()
                .maxResults(1)
                .build();

ec2Client.describeLaunchTemplates(request);

DescribeCapacityReservationsRequest.builder()
                .maxResults(200)
                .build();

ec2Client.describeCapacityReservations(request);

DescribeAutoScalingGroupsRequest.builder()
                .maxRecords(100)
                .build();

autoscalingClient.describeAutoScalingGroups(request);

DescribePlacementGroupsRequest.builder()
                .filters(Arrays.asList())
                .build();

ec2Client.describePlacementGroups(request);

DescribeSecurityGroupsRequest.builder()
                .filter(Arrays.asList())
                .maxResults(1000)
                .build();

ec2Client.describeSecurityGroups(request);

DescribeKeyPairsRequest.builder()
                .filters(Arrays.asList())
                .build();

ec2Client.describeKeyPairs(request);

DescribeVolumesRequest.builder()
                .filter(Arrays.asList())
                .maxResults(1000)
                .build();

ec2Client.describeVolumes(request);

DescribeSnapshotsRequest.builder()
                .filter(Arrays.asList())
                .maxResults(1000)
                .ownerIds(Arrays.asList("408278014231"))
                .build();

ec2Client.describeSnapshots(request);

DescribeHostsRequest.builder()
                .filter(Arrays.asList())
                .maxResults(500)
                .build();

ec2Client.describeHosts(request);

DescribeAddressesRequest.builder()
                .filters(Arrays.asList())
                .build();

ec2Client.describeAddresses(request);

DescribeInstancesRequest.builder()
                .filters(Arrays.asList())
                .maxResults(1000)
                .build();

ec2Client.describeInstances(request);

DescribeAccountAttributesRequest.builder()

                .build();

ec2Client.describeAccountAttributes(request);

DescribeAvailabilityZonesRequest.builder()

                .build();

ec2Client.describeAvailabilityZones(request);

DescribeAlarmsRequest.builder()
                .maxRecords(100)
                .stateValue("OK")
                .build();

cloudwatchClient.describeAlarms(request);

DescribeAlarmsRequest.builder()
                .maxRecords(100)
                .stateValue("INSUFFICIENT_DATA")
                .build();

cloudwatchClient.describeAlarms(request);

DescribeInstanceTypesRequest.builder()
                .maxResults(100)
                .build();

ec2Client.describeInstanceTypes(request);

DescribeInstanceTypesRequest.builder()
                .maxResults(100)
                .build();

ec2Client.describeInstanceTypes(request);

DescribeTagsRequest.builder()
                .maxResults(1000)
                .filters(Arrays.asList(name("resource-type").values(Arrays.asList("instance"))))
                .build();

ec2Client.describeTags(request);

DescribeAccountAttributesRequest.builder()

                .build();

ec2Client.describeAccountAttributes(request);

DescribeInstancesRequest.builder()
                .filters(Arrays.asList(name("instance-state-name").values(Arrays.asList("running"))))
                .maxResults(100)
                .build();

ec2Client.describeInstances(request);

DescribeInstanceStatusRequest.builder()
                .instanceIds(Arrays.asList("i-0e11209467d4fe4f0"))
                .build();

ec2Client.describeInstanceStatus(request);

DescribeInstanceTypesRequest.builder()
                .maxResults(100)
                .nextToken("AAIAAaD__-uMZpOLOrKWDNRqPVU03izSqbSBrF3zXfPEHafYTdjbDdy99YTaX-qW6trs0TfPtCYUJymC_sSBg40g-HNoX7OwEyoJnUti1fMEfU-n69YophivtxDyyLoa_cR9IHB369YMa2WhGYOKin1k0XivlEdKCS15ojN8v0p0gWEAU8RtUX4pvQwhjzBWldeHG3tvML5D-h8iYF1C0w-6")
                .build();

ec2Client.describeInstanceTypes(request);

DescribeInstanceTypesRequest.builder()
                .maxResults(100)
                .nextToken("AAIAAatGzOrBSSKu1D9XPl9eIIjA6y-Qdurqo3L9V5LxhsBel9Dbkpd9pI0qJ6tOo-ctpRvF3-42huzqgAMJ_n_CBOauPF2uk5L1oFx51F7rNSNge6d3HrI3eLvpvUmgu88MriXXgcftrd0DVmsXugM32UsDTMtOt1sIdQvC0TAe3A2rfVIsc8bGI_aAQLQSw6e-yf3PVdk_qAFBHVEk")
                .build();

ec2Client.describeInstanceTypes(request);

DescribeInstanceTypesRequest.builder()
                .maxResults(100)
                .nextToken("AAIAAe9ux_Ycg-oIdztfQHoMBLiEt5yH1QjT2pN5UDod7FOKa3Jq__eCYNHMIOID7Kqf_TRYJsmsPCQ18xkcTcvJzUEEhMcQoXemx_bB_aickUIDvuMXQdne5DaximM_ewsMI4u3Yw8N6MpdKjKp68Yi_T6DM0pwa-N53dR7ynp_Te4TOgIvFIxpKSvwigJlcvp45k_BpCeSQJd9C0YxZ-Ic")
                .build();

ec2Client.describeInstanceTypes(request);

DescribeInstanceTypesRequest.builder()
                .maxResults(100)
                .nextToken("AAIAAV57OYj2xiBfl5BtTPWJ_U_XNyZERe_RUTRGqCLP-AwUUGeNk7M5TNeXbdNveNghOFcZwmqliUmjBZTNYFfJl0KOXVKWf3lcAcM_2rYtOcZBZ0rZmBTx2k4KljkuyfXEJyZa26Hz7O1BYe165mFUT72SQt0j-RLPKthMFwbJQdbqxk3SoPFNHJfZSA_3F0fRXgCvockjWZ_nBA==")
                .build();

ec2Client.describeInstanceTypes(request);

DescribeInstanceTypesRequest.builder()
                .maxResults(100)
                .nextToken("AAIAAZfx8oY-47iVGXiALDZweJLVuhZC8QdMK0Q0UMf4oqzckKBy7p7zpw6H6BiFSmiInAj11kMIzHn-1PL1h-GFBKAZZx1Ni97x71UGWP2MlmRpQNvHwWxPDLH4lVI2GDC3xXKL2cg7lQ4BbtV1g9sZmJBWo1fCJn1_5m09BEHu2MbxwaZIGsoVPoqMDm-R6xefuVUHRJq1jDdA5UGOduKRpQ==")
                .build();

ec2Client.describeInstanceTypes(request);

DescribeInstanceTypesRequest.builder()
                .maxResults(100)
                .nextToken("AAIAAbbaBgwtJiLOZm2_XbnwtU07twwcM22xXRHmn4QrjYmOV4KyuPjNgKqLID1iy9eWAL5ximiYVhVLIM4OUoPjzPXnvmJWBV3VKOCLMXePG8G6zUevqYgKlv5DPub1iXojAqCp5Xd88Q4TqGwcRTler8gl_6q-3xQUXQtW8WdhWlK6OFm6zZmAOW-RsiDx_t8y9jlZTdkCEJGXm67xSqyzMw==")
                .build();

ec2Client.describeInstanceTypes(request);

DescribeNetworkInterfacesRequest.builder()
                .filters(Arrays.asList(name("attachment.instance-id").values(Arrays.asList("i-0e11209467d4fe4f0"))))
                .build();

ec2Client.describeNetworkInterfaces(request);

DescribeInstanceCreditSpecificationsRequest.builder()
                .instanceIds(Arrays.asList("i-0e11209467d4fe4f0"))
                .build();

ec2Client.describeInstanceCreditSpecifications(request);

DescribeInstanceAttributeRequest.builder()
                .instanceId("i-0e11209467d4fe4f0")
                .attribute("disableApiStop")
                .build();

ec2Client.describeInstanceAttribute(request);

DescribeInstanceAttributeRequest.builder()
                .instanceId("i-0e11209467d4fe4f0")
                .attribute("disableApiTermination")
                .build();

ec2Client.describeInstanceAttribute(request);

DescribeNetworkInterfacesRequest.builder()
                .filters(Arrays.asList(name("attachment.instance-id").values(Arrays.asList("i-0e11209467d4fe4f0"))))
                .build();

ec2Client.describeNetworkInterfaces(request);

DescribeAddressesRequest.builder()
                .filters(Arrays.asList(name("instance-id").values(Arrays.asList("i-0e11209467d4fe4f0"))))
                .build();

ec2Client.describeAddresses(request);

DescribeInstancesRequest.builder()
                .instanceIds(Arrays.asList("i-0e11209467d4fe4f0"))
                .build();

ec2Client.describeInstances(request);

DescribeReplaceRootVolumeTasksRequest.builder()
                .filters(Arrays.asList(name("instance-id").values(Arrays.asList("i-0e11209467d4fe4f0"))))
                .maxResults(50)
                .build();

ec2Client.describeReplaceRootVolumeTasks(request);

DescribeVolumesRequest.builder()
                .volumeIds(Arrays.asList("vol-068ef5c6e36f025a3"))
                .build();

ec2Client.describeVolumes(request);

DescribeInstanceImageMetadataRequest.builder()
                .instanceIds(Arrays.asList("i-0e11209467d4fe4f0"))
                .build();

ec2Client.describeInstanceImageMetadata(request);

DescribeEventsRequest.builder()
                .filter(services(Arrays.asList("EC2")).entityValues(Arrays.asList("i-0e11209467d4fe4f0")).eventTypeCodes(Arrays.asList("AWS_EC2_SIMPLIFIED_AUTO_RECOVERY_SUCCESS", "AWS_EC2_INSTANCE_AUTO_RECOVERY_SUCCESS", "AWS_EC2_SIMPLIFIED_AUTO_RECOVERY_FAILURE", "AWS_EC2_INSTANCE_AUTO_RECOVERY_FAILURE")).startTimes(Arrays.asList(from("2026-01-03T12:18:13.078Z"))))
                .build();

healthClient.describeEvents(request);

GetEnrollmentStatusRequest.builder()

                .build();

compute-optimizerClient.getEnrollmentStatus(request);

DescribeInstanceInformationRequest.builder()
                .filters(Arrays.asList(key("InstanceIds").values(Arrays.asList("i-0e11209467d4fe4f0"))))
                .build();

ssmClient.describeInstanceInformation(request);

DescribeInstanceStatusRequest.builder()
                .instanceIds(Arrays.asList("i-0e11209467d4fe4f0"))
                .build();

ec2Client.describeInstanceStatus(request);

DescribeVpcsRequest.builder()
                .vpcIds(Arrays.asList("vpc-0ce910c39715c2618"))
                .build();

ec2Client.describeVpcs(request);

DescribeSubnetsRequest.builder()
                .subnetIds(Arrays.asList("subnet-08d7538ac7b9c4999"))
                .build();

ec2Client.describeSubnets(request);

DescribeImagesRequest.builder()
                .imageIds(Arrays.asList("ami-02b8269d5e85954ef"))
                .build();

ec2Client.describeImages(request);

DescribeInstanceAttributeRequest.builder()
                .instanceId("i-0e11209467d4fe4f0")
                .attribute("disableApiStop")
                .build();

ec2Client.describeInstanceAttribute(request);

StopInstancesRequest.builder()
                .instanceIds(Arrays.asList("i-0e11209467d4fe4f0"))
                .build();

ec2Client.stopInstances(request);

DescribeInstancesRequest.builder()
                .instanceIds(Arrays.asList("i-0e11209467d4fe4f0"))
                .build();

ec2Client.describeInstances(request);

DescribeInstancesRequest.builder()
                .instanceIds(Arrays.asList("i-0e11209467d4fe4f0"))
                .build();

ec2Client.describeInstances(request);

DescribeInstancesRequest.builder()
                .instanceIds(Arrays.asList("i-0e11209467d4fe4f0"))
                .build();

ec2Client.describeInstances(request);

DescribeInstancesRequest.builder()
                .instanceIds(Arrays.asList("i-0e11209467d4fe4f0"))
                .build();

ec2Client.describeInstances(request);

DescribeInstancesRequest.builder()
                .instanceIds(Arrays.asList("i-0e11209467d4fe4f0"))
                .build();

ec2Client.describeInstances(request);

DescribeInstancesRequest.builder()
                .instanceIds(Arrays.asList("i-0e11209467d4fe4f0"))
                .build();

ec2Client.describeInstances(request);

DescribeInstancesRequest.builder()
                .instanceIds(Arrays.asList("i-0e11209467d4fe4f0"))
                .build();

ec2Client.describeInstances(request);

DescribeInstancesRequest.builder()
                .instanceIds(Arrays.asList("i-0e11209467d4fe4f0"))
                .build();

ec2Client.describeInstances(request);

DescribeInstancesRequest.builder()
                .instanceIds(Arrays.asList("i-0e11209467d4fe4f0"))
                .build();

ec2Client.describeInstances(request);

DescribeInstancesRequest.builder()
                .instanceIds(Arrays.asList("i-0e11209467d4fe4f0"))
                .build();

ec2Client.describeInstances(request);

DescribeInstancesRequest.builder()
                .instanceIds(Arrays.asList("i-0e11209467d4fe4f0"))
                .build();

ec2Client.describeInstances(request);

DescribeInstancesRequest.builder()
                .instanceIds(Arrays.asList("i-0e11209467d4fe4f0"))
                .build();

ec2Client.describeInstances(request);

DescribeAddressesRequest.builder()

                .build();

ec2Client.describeAddresses(request);

DescribeAddressTransfersRequest.builder()
                .maxResults(10)
                .build();

ec2Client.describeAddressTransfers(request);

DescribeAddressesAttributeRequest.builder()
                .attribute("domain-name")
                .maxResults(100)
                .build();

ec2Client.describeAddressesAttribute(request);

DescribeNatGatewaysRequest.builder()
                .maxResults(1000)
                .build();

ec2Client.describeNatGateways(request);
