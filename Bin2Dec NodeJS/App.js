const prompt = require('prompt-sync')();
while (true) {
    const binaryString = prompt("Enter Binary ?");
    let decimalNumber = 0;
    for (let index = 0; index < binaryString.length; index++) {
        const element = binaryString[index];
        if (!'01'.includes(element) ) {
            console.log('invalid inpur : only 0 and 1 are allowed');
            break;
        }
        decimalNumber = decimalNumber * 2 + parseInt(element,2);

    }
    console.log(decimalNumber);
    let wantToContinue = prompt("DO you want to continue ?");
    wantToContinue.toLowerCase;
    console.log(wantToContinue);
    if ('no'.includes(wantToContinue)) {
        break;
    }
}