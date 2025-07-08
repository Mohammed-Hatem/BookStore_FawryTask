#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    int n, q;
    cin >> n >> q;

    vector<long long> v(n);
    vector<long long> count(n + 1, 0);
    vector<pair<int,int>> queries(q);

    for (int i = 0; i < n; i++) {
        cin >> v[i];
    }

    for(int i = 0; i < q; i++) {
        cin >> queries[i].first >> queries[i].second;
    }

    sort(v.begin(), v.end());
    reverse(v.begin(), v.end());

    for (int i = 0; i < q; i++) {
        count[queries[i].first - 1]++;
        count[queries[i].second]--;
    }


    for (int i = 1; i < n; i++) {
        count[i] += count[i - 1];
    }

    sort(count.begin(), count.begin() + n);
    reverse(count.begin(), count.begin() + n);

    long long sum = 0;
    for (int i = 0; i < n; i++) {
        sum += v[i] * count[i];
    }

    cout << sum;

    return 0;
}