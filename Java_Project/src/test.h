//
//  dataManager.h
//  Watch2.0_545
//
//  Created by Kang hyeyoun on 2014. 9. 16..
//  Copyright (c) 2014년 csos. All rights reserved.
//

/* Singleton pattern 
 * All information to communication each class
 */
#import <Foundation/Foundation.h>
#import <CoreBluetooth/CoreBluetooth.h>

@interface dataManager : NSObject
{
    NSString *currentWatchIdentifier;   // 선택한시계 ID
    NSArray *watchArray;                // 시계 목록
    int typeOfButton;                   // 버튼 구분
    int typeOfPopover;                  // 팝오버 구분
    NSData *savedWorkData;              //
    NSMutableArray *willSendData;       // 보낼 패킷
    NSMutableArray *peripherals;        // 스캔 된 페리페럴 목록
    CBCentralManager *centralManager;   // 스캔 한 샌트럴
    NSString *currentDevice;
    NSString *currentUserID;
}

@property (nonatomic, retain) NSString *currentDevice;
@property (nonatomic, retain) NSString *currentUserID;

@property (nonatomic, retain) NSString *currentWatchIdentifier;
@property (nonatomic, retain) NSArray *watchArray;
@property (nonatomic, assign) int typeOfButton;
@property (nonatomic, assign) int typeOfPopover;
@property NSMutableArray *peripherals;
@property CBCentralManager *centralManager;

@property (nonatomic, retain) NSMutableArray *willSendData;
+(id)sharedManager;

@end
