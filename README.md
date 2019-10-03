# Tasks : will come soon
## Git configuration.
 Configure ssh connection based on git documentation https://help.github.com/articles/connecting-to-github-with-ssh.

1). Fork repository  https://github.com/secourse2019/workrep to your own user.

2). Clone your fork to your local machine:

git clone https://github.com/your_fork_url/secourse2019/workrep

3). cd workrep

4). git remote add upstream  https://github.com/your_fork_url/secourse2019/workrep

5). git pull upstream master

6). git checkout -b task_name

And then after adding files (git add ...) use git commit (add description) and then push:

7). git push origin task_name
And on https://github.com/secourse2019/workrep you will see possibility to "Compare & Pull Request"
