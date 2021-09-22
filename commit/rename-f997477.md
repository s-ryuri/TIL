# rename@f997477

[Permalink](rename-f997477.md)

 Showing with **24 additions** and **0 deletions**.

1.  +24 −0 [Pandas/rename.md](rename-f997477.md#diff-8286fe9671db3e976d43465729a7cc597dee01198414e2c6c7ce33dc7416ec21)

|  |  | @@ -0,0 +1,24 @@ |
| :--- | :--- | :--- |
|  |  |  Pandas에서 열 이름을 변경하는 방법으로는 columns, rename이 있다. |
|  |  |  |
|  |  |  보통 columns는 전체 열의 이름을 한 번에 바꿀 때 사용하고 |
|  |  |  rename은 원하는 열만 바꿀 때 사용한다. |
|  |  |  |
|  |  |  \# rename |
|  |  |  |
|  |  |  사용하는 방법은 간단하다. |
|  |  |  |
|  |  |  \`\`\`python |
|  |  |  df = pd.DataFrame\(\[\[15,'kim'\],\[27,'lee'\],\[35,'min'\]\],columns = \['age','name'\]\) |
|  |  |  df |
|  |  |  \`\`\` |
|  |  |  !\[image\]\(https://user-images.githubusercontent.com/66999675/131210747-6d6f14ba-a94d-49e3-81fe-247f6361f940.png\) |
|  |  |  |
|  |  |  이런 데이터가 있다고 했을 때 age만 바꾼다고 하면 |
|  |  |  |
|  |  |  \`\`\`python |
|  |  |  df.rename\(columns = {'age':'AGE'},inplace = True\) |
|  |  |  \`\`\` |
|  |  |  |
|  |  |  !\[image\]\(https://user-images.githubusercontent.com/66999675/131210754-9cd8e337-ec72-48a6-896b-e7626eaac0d1.png\) |
|  |  |  |
|  |  |  이렇게 바뀌게 된다. |

