function gcdOfStrings(str1: string, str2: string): string {
    function gcd(a: number, b: number): number {
        if (b === 0) return a;
        return gcd(b, a % b);
    }
    function divisible(s: string, t: string): boolean {
        if (s.length % t.length !== 0) return false;
        const repeatTimes = s.length / t.length;
        let concatenated = '';
        for (let i = 0; i < repeatTimes; i++) {
            concatenated += t;
        }
        return concatenated === s;
    }

    const gcdLength = gcd(str1.length, str2.length);
    const GCDString = str1.substring(0, gcdLength);

    if (divisible(str1, GCDString) && divisible(str2, GCDString)) {
        return GCDString;
    } else {
        return "";
    }
}