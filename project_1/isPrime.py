def isPrime(x) -> bool:
    if x == 1:
        return False
    for i in range(2, x):
        if not x % i:
            return False
    return True


def run(idx):
    for i in range(1, 20001):
        if isPrime(i):
            if idx % 5:
                print(i, end=' ')
                idx += 1
            else:
                print(i)
                idx = 1


if __name__ == '__main__':
    idx = 1
    run(idx)