package Problem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FillOrder {
    public static void main(String[] args) {
        List<Integer> order = new ArrayList<>(List.of(8526325, 4867889, 8459224, 3142131, 9022648, 4681201, 3069980,
                7567872, 8928157, 4199985, 3978583, 8896023, 9897954, 3337377, 60730, 6728438, 6560134, 7127216,
                4662643, 6798622, 4460887, 6785305, 2658899, 5800236, 5519679, 3179685, 7603035, 2088980, 1189200,
                9460865, 1809865, 9715524, 6845105, 2785441, 2857655, 8384104, 9982993, 8443986, 5951975, 8911149,
                5160323, 2446910, 323523, 5058276, 5784286, 2900604, 1786713, 4860771, 2544171, 8965707, 1659393,
                7005058, 8267364, 6834643, 2805293, 3787042, 14327, 2924680, 5876021, 3719879, 4901896, 202237, 3435402,
                1747001, 2987677, 8809408, 131104, 5487021, 7253394, 8599431, 6914521, 4930068, 1046340, 7238043,
                9988343, 9346977, 2654999, 4291407, 6724100, 5199169, 5773466, 8383492, 2204226, 4040829, 5218134,
                7525871, 7827870, 7748812, 450550, 6220242, 1468690, 5352445, 6422478, 4904092, 9615797, 1926507,
                6229851, 2263253, 7413527, 5999596, 862683, 4328048, 929663, 4425374, 4082442, 3434357, 6288702,
                6737440, 7725764, 3012801, 4452961, 6015581, 1396292, 9173538, 56409, 9130777, 6699408, 7884278,
                6879589, 9666309, 4104519, 864630, 5018754, 3043348, 8285073, 4634550, 4969854, 4514924, 6897802,
                4899733, 514519, 276836, 9227780, 3960534, 4702209, 5826573, 7394890, 990911, 5080365, 7637005, 6520063,
                9533325, 3652585, 7916355, 1223214, 3708993, 9563483, 7922622, 4109622, 6443071, 105282, 730492,
                9824053, 5124035, 6290192, 8109125, 2274937, 1260045, 2624048, 9172738, 8676129, 5654919, 9449574,
                7903908, 2131804, 6668134, 6246833, 9526693, 175396, 1327197, 9680050, 6695459, 3376873, 5848986,
                7128165, 7116438, 2074331, 6691647, 5039059, 8700304, 5651070, 5144341, 9430796, 5475122, 2784727,
                8237339, 3584246, 5059663, 9497383, 8724646, 6748753, 8173512, 6895916, 8714678, 8593771, 9027719,
                5382811, 7356955, 1070763, 5558207, 1200503, 3267164, 4770017, 4577375, 9116150, 1898181, 1693813,
                1190480, 1106179, 9249223, 9890783, 6757248, 6909915, 1837930, 4748721, 2210994, 75268, 849319, 7270656,
                2089003, 9573964, 6535760, 2778866, 8986231, 5250437, 3888988, 8013949, 3149600, 1245943, 1601063,
                1224158, 2446445, 4868227, 5994174, 9540172, 3984376, 408706, 1233984, 7691207, 1514884, 2999558,
                7581989, 8272132, 2425825, 1936271, 5537204, 4636818, 4527890, 6386522, 4423825, 6616892, 5960485,
                959585, 9395757, 4946715, 8726373, 3284745, 5477015, 4392324, 7047039, 7078078, 5616481, 9493483,
                1946304, 4127006, 9033654, 8447031, 4535711, 2783989, 6138237, 6050595, 8299899, 6236577, 6839078,
                725723, 8172847, 2376281, 7878892, 2700737, 8762803, 2302716, 1833980, 7239639, 5778652, 3746089,
                4702706, 7021377, 9547185, 179720, 1413700, 6594223, 9774149, 7030181, 6087705, 4236804, 1157186,
                7637711, 2683834, 8209249, 2938051, 1338422, 4259843, 1237949, 91351, 3615272, 4480023, 780549, 8507904,
                2358914, 5997637, 7270706, 7177982, 7831617, 7026697, 2956633, 1577705, 1729402, 2494361, 1124889,
                4425473, 3908061, 7719111, 6715974, 3454593, 6323167, 952777, 4611778, 6477229, 6152963, 2821026,
                9415280, 7736, 9597220, 3169580, 99086, 3212491, 7649603, 879635, 1720395, 8516, 6877271, 1507452,
                9702849, 4708887, 1050500, 2659482, 8802943, 2779901, 5153842, 9927831, 9721726, 1578254, 163293,
                8954051, 5032846, 9002812, 2423179, 9644624, 5480040, 8576141, 4982001, 7411671, 1100229, 7095573,
                3097603, 1199314, 2824415, 747205, 2078948, 7061161, 3272072, 1472571, 8568613, 2974921, 6181457,
                2135464, 8150754, 7500752, 7431717, 5820947, 9944934, 7153442, 7399201, 108227, 8623844, 2432046,
                1627390, 1047022, 4593021, 9623781, 2139515, 2091374, 9551804, 3239743, 9186946, 2649406, 4439056,
                2011360, 3396610, 9034356, 1588873, 9185033, 506926, 157485, 2159953, 9204734, 2292948, 310706, 6705485,
                2241016, 8648005, 6650419, 9394457, 6047205, 9274997, 534652, 8479250, 902386, 1581674, 5588623,
                3042518, 3721188, 7679996, 2594321, 9477282, 9383293, 5243726, 3916337, 3911004, 1156687, 5467044,
                5499876, 341720, 5973969, 5657360, 5018024, 5178703, 466660, 5328730, 4400539, 5224027, 3976734,
                1050957, 4618484, 2540290, 325953, 7669487, 3535891, 3744690, 9251160, 9124513, 6787208, 5488699,
                9320860, 1897880, 4965980, 8704152, 9657958, 1398669, 2615156, 814644, 6865712, 8115031, 3672715,
                5356033, 6288743, 8690739, 3051087, 9271754, 6535820, 7451625, 4495780, 3028905, 1018934, 1630615,
                5569194, 3861238, 9300102, 9105084, 7605928, 8551261, 745949, 6909487, 6556312, 66808, 1323718, 1522291,
                8770960, 981675, 5437311, 1386115, 1796319, 2303023, 2017497, 5469033, 175407, 8306239, 6676123,
                3226493, 94344, 3211942, 678117, 4590124, 6240846, 1697050, 6220738, 4326391, 8074640, 8037191, 3431475,
                5680567, 9104804, 6693775, 5106405, 5661115, 6760582, 6430122, 9699757, 8047893, 9928149, 5137068,
                1950359, 4240819, 7440090, 3967856, 2226203, 7615496, 4790446, 8902326, 841988, 4884790, 2114267,
                4036456, 9474913, 871465, 8249858, 8212002, 5197855, 6324497, 6249193, 8629329, 4521415, 5353996,
                7839455, 2144171, 1015110, 4600037, 1090644, 714866, 2647929, 1018792, 5851933, 4598288, 5259610,
                5808374, 1082495, 2165, 5940221, 5872940, 8904490, 9298560, 757729, 1018756, 3335016, 232641, 4406572,
                4101225, 960995, 9604427, 2942073, 7210187, 750107, 9979839, 2564182, 8589562, 2124009, 6095643,
                3189598, 5731004, 6810508, 8353878, 9266148, 5178793, 5468517, 7042109, 987166, 6551011, 7044273,
                6927387, 2423951, 5948762, 6225946, 5698031, 9483870, 2077313, 5930672, 3890441, 8694889, 6891666,
                6011219, 1636961, 6618204, 6761326, 1616799, 9182385, 5350887, 6257159, 5278027, 1056836, 4504515,
                4604886, 1927065, 3770662, 9783678, 7395582, 812770, 3287196, 3946592, 7857043, 2730934, 8886894,
                3805804, 1473231, 4584925, 5806025, 3550544, 3031948, 2212818, 4761784, 2439965, 8224036, 6398745,
                9058168, 4985361, 531895, 8240552, 2852599, 9305406, 6034930, 3909434, 3809920, 3156167, 5836499,
                7580581, 5456197, 5748432, 909702, 8743392, 9695023, 8766744, 3990677, 1098269, 5088900, 5463907,
                5683193, 3411276, 1530802, 8715140, 5624093, 6292586, 1155104, 3848129, 5207682, 213271, 1349841,
                8255928, 970174, 4202440, 77685, 9521455, 628225, 3887604, 2677621, 8981075, 3984536, 8133817, 4729506,
                7410590, 9393560, 6940881, 6177333, 3384236, 8039149, 3782584, 1364495, 6238693, 7193860, 5411648,
                7470184, 2817952, 4220585, 1141639, 9182432, 9428266, 1354909, 532273, 200546, 4841434, 4734712, 278230,
                4362888, 7879288, 6682186, 9556860, 6860363, 3183073, 7690677, 4106220, 593662, 9600588, 3563452,
                6770995, 5501176, 4118952, 3069930, 6865670, 357644, 263789, 4793669, 344179, 5598093, 9014254, 1485817,
                4780524, 958871, 5357077, 5312796, 1159416, 2714862, 2563859, 3953998, 7077749, 2959499, 636183,
                9150961, 2336213, 6335607, 9357989, 6442432, 6929269, 8958576, 2522236, 6216615, 4459751, 6641187,
                9286544, 3841772, 9515183, 9550333, 8635441, 9859361, 7664777, 166046, 3861530, 2445300, 1124916,
                9218606, 7758096, 4800684, 1933468, 2838306, 8754681, 1527568, 5797804, 1907215, 678528, 8134016,
                8242821, 36516, 7092800, 5172089, 1511444, 9615035, 3905055, 8487546, 8772573, 3191599, 2329318,
                8287755, 5258283, 3481110, 663468, 2923059, 6163507, 4524997, 5368358, 7288422, 6259954, 5642805,
                4605457, 709773, 997463, 3360137, 4753693, 9311618, 7783703, 5432220, 9961986, 6026524, 7985088,
                7054785, 3714964, 2012883, 9186171, 7620019, 500428, 475095, 3327969, 2829745, 1279202, 8586251,
                8827206, 1942669, 4025661, 4990712, 8984017, 1910370, 4795486, 7760322, 69527, 9400942, 8470095,
                1066989, 5277431, 3223787, 2894958, 3061133, 1172358, 2856943, 9087656, 1673797, 2428079, 2802620,
                3686679, 4130601, 2938990, 4187107, 4605696, 6266958, 9533203, 5884897, 7369560, 876761, 343917,
                1395220, 8383824, 9327933, 3305589, 3179309, 9604606, 5891467, 5096603, 8074700, 6958455, 374033,
                3814838, 2369765, 5951517, 7503548, 5226707, 5039173, 9177344, 171138, 358144, 5380375, 4301738,
                3297133, 9567481, 8907433, 2080442, 1617035, 4792329, 9450001, 2493795, 7652597, 845220, 3393971,
                9496881, 6667160, 6573279, 9101487, 2558627, 4186233, 9692538, 2033433, 4560265, 3507376, 4403197,
                511782, 3527275, 2146256, 8067306, 2704618, 2317393, 941801, 8084992, 6619130, 4238933, 168824, 8042915,
                8835726, 1785859, 5351595, 8285726, 6796005, 3004192, 1647297, 189975, 2501072, 8314456, 9279606,
                1602558, 3389434, 3465838, 1295096, 5422867, 542455, 7318823, 2342415, 1054236, 846097, 4488670,
                1637893, 6067066, 9322414, 2579693, 4152058, 5941544, 9334977, 6837233, 3984458, 8170702, 1139443,
                1852404, 6456427, 451800, 4856595, 620075, 641774, 7357667, 8934530, 2437731, 1476576, 2323964, 8419921,
                2771671, 263182, 8962375, 2606845, 5121948, 2532962, 3452941, 2126970, 4170854, 2036359, 1449383,
                9266898, 6188416, 9907278, 8601874, 3025648, 6408087, 9288927, 6681443, 8260491, 8261705, 7133242,
                3117085, 8881779, 291367, 2991103, 7816308, 2729098, 4467679, 2656623, 1149018, 9755701, 5436156,
                2627744, 2362546, 3074456, 5160705, 8331838, 5201425, 1847910, 368196, 6650807, 1114807, 9072963,
                9074437, 9716680, 4614963, 5482523, 9005606, 1296405, 3743013, 7267310, 8429646, 9376450, 8665440,
                8721012, 4883904, 8998099, 3966461, 9351582, 1654722, 7631830, 9107283, 9607229, 259573, 3986180,
                2681684, 5420277, 4834369, 7883108, 7268186, 7718917, 7050267, 8382992, 6791879, 8641055, 616023,
                3923193, 4123577, 2137980, 5219597, 382942, 1921641, 6165594, 2275743, 587080, 7402958, 7159646,
                9585179, 1369418, 6511228, 3756252, 9001248, 8134862, 3363480, 9260820, 4637393, 8561516, 7197449,
                1988113, 8960975, 4465634, 9707029, 8527593, 5364978, 6498908, 7168647, 5981000, 422100, 1292224,
                635332, 8158049, 4191517, 2556972, 6839994, 6467259, 3144052, 4242951, 6143256, 5245582, 8128721,
                5170835, 9001833, 9646320, 5822048, 4881664, 1423491, 459440, 3443179, 8620939, 2447553, 4920506,
                5602925, 2154581, 3448098, 967902, 1169840, 3133097, 9465253, 4108292, 6941672, 100584, 4782692,
                1133188, 2657556, 1622685, 116798, 8317959, 8381988, 6260053, 3563540, 6510708, 1430888, 2565372,
                8673379, 7252935, 9963387, 96869, 228727, 5922918, 8717808, 5192631, 843423, 4320732, 9863563, 6807872,
                7804985, 3549755, 9940968, 9786589, 7658046, 6882639, 9887173, 4957089, 532178, 5061080, 9096125,
                648975, 5895390, 7478112, 9425380, 9458929, 6505171, 856267, 4540652, 5178549, 625553, 7020390, 5275418,
                3370631, 2943307, 6509577, 8563261, 6303081, 830308, 8426824, 3110953, 1151644, 1976578, 5568272,
                938232, 2150975, 4967263, 3341756, 7108063, 5499440, 8402835, 6204187));
        // List<Integer> order = new ArrayList<>(List.of(
        // 5,
        // 4,
        // 6));
        int k = 399720886;
        // int k = 3;
        System.out.println(filledOrders(order, k));
    }

    public static int filledOrders(List<Integer> order, int k) {
        System.out.println("order = " + order);
        System.out.println("k = " + k);
        int count = 0;
        int orderCount = 0;
        Collections.sort(order);
        for (int i = 0; i < order.size(); i++) {
            count += order.get(i);
            if (count > k) {
                System.out.println("before return :" + orderCount);
                return orderCount;
            }

            orderCount++;
        }

        return orderCount;
    }

    public static int filledOrderss(List<Integer> order, int k) {
        int len = order.size();
        int count = 0;
        Collections.sort(order);
        for (int ord : order) {
            if (ord <= k)
            {
                // Also read :HackerRank Problem Solving (Basic) Solution 1 : JAVA
                count++;
                k = k - ord;
            }
        }
        return count;
    }
}