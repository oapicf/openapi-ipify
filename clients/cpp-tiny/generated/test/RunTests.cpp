
#include "IpTest.cpp"



void setUp(){}

void tearDown(){}

void runTests(){
    
    
    RUN_TEST(test_Ip_ip_is_assigned_from_json);
    
    

    
    
    RUN_TEST(test_Ip_ip_is_converted_to_json);
    
    


}

int main(void) {
    UNITY_BEGIN();
    runTests();
    return UNITY_END();
}

void setup() {
    UNITY_BEGIN();
    runTests();
    UNITY_END();
}

void loop() {

}
